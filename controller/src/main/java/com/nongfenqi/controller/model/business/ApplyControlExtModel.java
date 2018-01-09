package com.nongfenqi.controller.model.business;

import java.util.List;

/**
 * 申请单控制记录扩展
 *
 * @author jiezhi
 * @version 1.0, 14/03/2017
 * @since [Sherlock/V1.0.0]
 */
public class ApplyControlExtModel {
    private static final String TAG = ApplyControlExtModel.class.getSimpleName();

    /**
     * applyId : string
     * applyItemControls : [{"comment":"内容","id":"AI10000","name":"家庭信息","progress":100,"score":89}]
     * totalScore : 0
     */

    private String applyId;
    private int totalScore;
    private List<ApplyItemControlsEntity> applyItemControls;

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public List<ApplyItemControlsEntity> getApplyItemControls() {
        return applyItemControls;
    }

    public void setApplyItemControls(List<ApplyItemControlsEntity> applyItemControls) {
        this.applyItemControls = applyItemControls;
    }

    public static class ApplyItemControlsEntity {
        /**
         * comment : 内容
         * id : AI10000
         * name : 家庭信息
         * progress : 100
         * score : 89
         */

        private String comment;
        private String id;
        private String name;
        private int progress;
        private int score;

        private ApplyItemControlsEntity(Builder builder) {
            setComment(builder.comment);
            setId(builder.id);
            setName(builder.name);
            setProgress(builder.progress);
            setScore(builder.score);
        }

        public String getComment() {
            return comment;
        }

        public void setComment(String comment) {
            this.comment = comment;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getProgress() {
            return progress;
        }

        public void setProgress(int progress) {
            this.progress = progress;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return "ApplyItemControlsEntity{" +
                    "comment='" + comment + '\'' +
                    ", id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    ", progress=" + progress +
                    ", score=" + score +
                    '}';
        }

        public static final class Builder {
            private String comment;
            private String id;
            private String name;
            private int progress;
            private int score;

            public Builder() {
            }

            public Builder comment(String val) {
                comment = val;
                return this;
            }

            public Builder id(String val) {
                id = val;
                return this;
            }

            public Builder name(String val) {
                name = val;
                return this;
            }

            public Builder progress(int val) {
                progress = val;
                return this;
            }

            public Builder score(int val) {
                score = val;
                return this;
            }

            public ApplyItemControlsEntity build() {
                return new ApplyItemControlsEntity(this);
            }
        }
    }

    @Override
    public String toString() {
        return "ApplyControlExtModel{" +
                "applyId='" + applyId + '\'' +
                ", totalScore=" + totalScore +
                ", applyItemControls=" + applyItemControls +
                '}';
    }
}
