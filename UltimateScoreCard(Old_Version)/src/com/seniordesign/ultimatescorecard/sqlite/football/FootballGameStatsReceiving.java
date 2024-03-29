package com.seniordesign.ultimatescorecard.sqlite.football;

public class FootballGameStatsReceiving {
	long p_id;
	long g_id;
	int tgt;
	int rec;
	int yds;
	int tds;
	int twopc;
	
	// constructors
    public FootballGameStatsReceiving() {
    }
 
    public FootballGameStatsReceiving(long p_id, long g_id) {
        this.p_id = p_id;
        this.g_id = g_id;
    }
    
    // setters
    public void setpid(long p_id) {
        this.p_id = p_id;
    }
    
    public void setgid(long g_id) {
        this.g_id = g_id;
    }
    
    public void settgt(int tgt) {
        this.tgt = tgt;
    }
    
    public void setrec(int rec) {
        this.rec = rec;
    }
    
    public void setyds(int yds) {
        this.yds = yds;
    }
    
    public void settds(int tds) {
        this.tds = tds;
    }
    
    public void settwopc(int twopc) {
        this.twopc = twopc;
    }
    
    // getters
    public long getpid() {
        return this.p_id;
    }
    
    public long getgid() {
        return this.g_id;
    }
    
    public int gettgt() {
    	return tgt;
    }
    
    public int getrec() {
    	return rec;
    }
    
    public int getyds() {
    	return yds;
    }
    
    public int gettds() {
    	return tds;
    }
    
    public int gettwopc() {
    	return twopc;
    }
}
