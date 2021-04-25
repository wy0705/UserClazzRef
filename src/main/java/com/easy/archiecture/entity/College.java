package com.easy.archiecture.entity;

import java.io.Serializable;

public class College implements Serializable {
    //private static final long serialVersionUID

    private int cid;
    private String name;
    private int nnscore_line;
    private int nscore_line;
    private int score_line;
    private int eeNumber;
    private int eeNumberMax;
    private boolean difficulty;

    public int getEeNumberMax() {
        return eeNumberMax;
    }

    public void setEeNumberMax(int eeNumberMax) {
        this.eeNumberMax = eeNumberMax;
    }

    public int getEeNumber() {
        return eeNumber;
    }

    public void setEeNumber(int eeNumber) {
        this.eeNumber = eeNumber;
    }

    public boolean isDifficulty() {
        return difficulty;
    }

    public void setDifficulty(boolean difficulty) {
        this.difficulty = difficulty;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNnscore_line() {
        return nnscore_line;
    }

    public void setNnscore_line(int nnscore_line) {
        this.nnscore_line = nnscore_line;
    }

    public int getNscore_line() {
        return nscore_line;
    }

    public void setNscore_line(int nscore_line) {
        this.nscore_line = nscore_line;
    }

    public int getScore_line() {
        return score_line;
    }

    public void setScore_line(int score_line) {
        this.score_line = score_line;
    }

    public College() {
    }

    public College(String name, int nnscore_line, int nscore_line, int score_line, int eeNumber, int eeNumberMax, boolean difficulty) {
        this.name = name;
        this.nnscore_line = nnscore_line;
        this.nscore_line = nscore_line;
        this.score_line = score_line;
        this.eeNumber = eeNumber;
        this.eeNumberMax = eeNumberMax;
        this.difficulty = difficulty;
    }

    public College(int cid, String name, int nnscore_line, int nscore_line, int score_line, int eeNumber, int eeNumberMax, boolean difficulty) {
        this.cid = cid;
        this.name = name;
        this.nnscore_line = nnscore_line;
        this.nscore_line = nscore_line;
        this.score_line = score_line;
        this.eeNumber = eeNumber;
        this.eeNumberMax = eeNumberMax;
        this.difficulty = difficulty;
    }
}
