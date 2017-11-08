package com.greenfox.kaghee.frontend;
    import org.junit.Before;
    import org.junit.Test;
    import org.junit.runner.RunWith;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.boot.test.context.SpringBootTest;
    import org.springframework.http.MediaType;
    import org.springframework.test.context.junit4.SpringRunner;
    import org.springframework.test.context.web.WebAppConfiguration;
    import org.springframework.test.web.servlet.MockMvc;
    import org.springframework.web.context.WebApplicationContext;
    import org.springframework.web.servlet.config.annotation.EnableWebMvc;

    import java.nio.charset.Charset;

    import static org.hamcrest.core.Is.is;
    import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
    import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
    import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
    import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = FrontendApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class RestControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void testSuccessfulDoubling() throws Exception {
        mockMvc.perform(get("/doubling?input=15")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.received", is(15)))
                .andExpect(jsonPath("$.result", is(30)));
    }

    @Test
    public void testDoublingWithNoInput() throws Exception {
        mockMvc.perform(get("/doubling")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.error", is("Please provide an input!")));
    }

    @Test
    public void testSuccessfulGreeting() throws Exception {
        mockMvc.perform(get("/greeter?name=sanyi&title=student")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.welcome_message", is("Oh, hi there sanyi, my dear student!")));
    }

    @Test
    public void testGreetingWithNoName() throws Exception {
        mockMvc.perform(get("/greeter?title=student")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.error", is("Please provide a name!")));
    }

    @Test
    public void testGreetingWithNoTitle() throws Exception {
        mockMvc.perform(get("/greeter?name=sanyi")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.error", is("Please provide a title!")));
    }

    @Test
    public void testSuccessfulAppendA() throws Exception {
        mockMvc.perform(get("/appenda/kuty")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath( "$.appended", is("kutya")));
    }

    @Test
    public void testSuccessfulDountilSum() throws Exception {
        mockMvc.perform(post("/dountil/sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 15}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(120)));
    }

    @Test
    public void testUnsuccessfulWithoutWhat() throws Exception {
        mockMvc.perform(post("/dountil/")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().is4xxClientError());

    }

    @Test
    public void testSuccessfulDountilFactor() throws Exception {
        mockMvc.perform(post("/dountil/factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\": 9}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("$.result", is(362880)));
    }
}
