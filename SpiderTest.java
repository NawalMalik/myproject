package com.stephen.crawler;

public class SpiderTest {
	public static void main(String[] args)
    {
	Spider spider = new Spider();
	spider.crawl("http://www.shophive.com/apple/mac", "computer");
    }

}
