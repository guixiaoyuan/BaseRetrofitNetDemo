package com.nongfenqi.controller.model.credit;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 22/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class CreditRiskReportModel {
    private static final String TAG = CreditRiskReportModel.class.getSimpleName();


    /**
     * decision : string
     * reportFileId : string
     * score : 0
     */

    private String decision;
    private String reportFileId;
    private int score;

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getReportFileId() {
        return reportFileId;
    }

    public void setReportFileId(String reportFileId) {
        this.reportFileId = reportFileId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "CreditRiskReportModel{" +
                "decision='" + decision + '\'' +
                ", reportFileId='" + reportFileId + '\'' +
                ", score=" + score +
                '}';
    }
}
