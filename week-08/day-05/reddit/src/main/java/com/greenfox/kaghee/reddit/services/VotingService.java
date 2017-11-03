package com.greenfox.kaghee.reddit.services;

import com.greenfox.kaghee.reddit.models.Post;

public class VotingService {

    public void upvote(Post post) {
        post.setScore(post.getScore() + 1);
    }

    public void downvote(Post post) {
        post.setScore(post.getScore() - 1);
    }
}
