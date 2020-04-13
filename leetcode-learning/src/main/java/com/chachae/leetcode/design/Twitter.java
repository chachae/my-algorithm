package com.chachae.leetcode.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author chachae
 * @since 2020/4/13 11:05
 */
public class Twitter {

  /**
   * 推文时间线
   */
  private List<Tweet> timeLine;

  /**
   * 每条推文的信息
   */
  private class Tweet {

    private int id;
    private int tweetId;

    public Tweet() {
    }

    public Tweet(int id, int tweetId) {
      this.id = id;
      this.tweetId = tweetId;
    }

    public int getId() {
      return id;
    }

    public int getTweetId() {
      return tweetId;
    }

    @Override
    public String toString() {
      return id + ":" + tweetId;
    }
  }

  /**
   * 用户关注列表
   */
  private Map<Integer, Set<Integer>> followers;


  public Twitter() {
    timeLine = new ArrayList<>();
    followers = new HashMap<>();
  }

  private boolean isMyFollower(int userId, int checkedId) {
    // 关注列表包换本人的信息
    if (followers.containsKey(userId)) {
      Set<Integer> set = followers.get(userId);
      return userId == checkedId || set.contains(checkedId);
    }
    return userId == checkedId;
  }

  public void postTweet(int userId, int tweetId) {
    // 保存推文信息
    Tweet tweet = new Tweet(userId, tweetId);
    // 存入时间栈中
    timeLine.add(tweet);
  }

  public List<Integer> getNewsFeed(int userId) {
    int initSize = 10;
    int startSize = 0;
    // 初始化最近10条推文数据
    List<Integer> res = new ArrayList<>(initSize);
    // 循环推文时间线
    int size = timeLine.size();
    for (int i = size - 1; i >= 0; i--) {
      Tweet tweet = timeLine.get(i);
      if (isMyFollower(userId, tweet.getId())) {
        res.add(tweet.getTweetId());
        startSize++;
        if (startSize == 10) {
          break;
        }
      }
    }
    return res;
  }

  public void follow(int followerId, int followeeId) {
    Set<Integer> set =
        followers.containsKey(followerId) ? followers.get(followerId) : new HashSet<>();
    set.add(followeeId);
    followers.put(followerId, set);
  }

  public void unfollow(int followerId, int followeeId) {
    if (followers.containsKey(followerId)) {
      // 当前用户关注列表
      Set<Integer> set = followers.get(followerId);
      // 设置并存储关注信息
      set.remove(followeeId);
      followers.put(followerId, set);
    }
  }
}
