package com.nongfenqi.controller.model.credit;

/**
 * 调查表导航
 *
 * @author luzhichao
 * @version 2.1, 17/5/27
 * @since [sherlock/V2.1.0]
 */

public class CreditNavInfoModel {
    /**
     * decision : string
     * name : 小明
     * relationType : 客户、共借人、担保人
     * reportFileId : string
     * score : 87
     */

    private String decision;
    private String name;
    private RelationType relationType;
    private String reportFileId;
    private int lawCount;
    private int score;


    public int getLawCount() {
        return lawCount;
    }

    public void setLawCount(int lawCount) {
        this.lawCount = lawCount;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RelationType getRelationType() {
        return relationType;
    }

    public void setRelationType(RelationType relationType) {
        this.relationType = relationType;
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

    public static class RelationType {
        private String name;
        private int id;

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }
    }
}
