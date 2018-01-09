package com.nongfenqi.controller.model.system;

/**
 * Function
 *
 * @author jiezhi
 * @version 1.0, 17/11/2016
 * @see [相关类/方法]
 * @since [农人帮/V1.4.0]
 */
public class FileModel {
    private static final String TAG = FileModel.class.getSimpleName();

    /**
     * createdTime : 2017-03-03 14:02:33
     * fileId : 0143bc64aa20d3190f8ea192a344315e
     * fileMd5 : a32f486cba4b99b53df21cd0a9ef9c0c
     * fileName : test.doc
     * fileSize : 1024
     * fileType : jpg
     * imageMetadata : {"colorSpace":"string","createTime":"2017-03-03 14:02:33","deviceMake":"string","deviceModel":"string","imageHeight":0,"imageWidth":0,"lat":0,"lon":0,"orientation":"string"}
     */

    private String createdTime;
    private String fileId;
    private String fileMd5;
    private String fileName;
    private int fileSize;
    private String fileType;
    private ImageMetadataEntity imageMetadata;

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public ImageMetadataEntity getImageMetadata() {
        return imageMetadata;
    }

    public void setImageMetadata(ImageMetadataEntity imageMetadata) {
        this.imageMetadata = imageMetadata;
    }

    public static class ImageMetadataEntity {
        /**
         * colorSpace : string
         * createTime : 2017-03-03 14:02:33
         * deviceMake : string
         * deviceModel : string
         * imageHeight : 0
         * imageWidth : 0
         * lat : 0
         * lon : 0
         * orientation : string
         */

        private String colorSpace;
        private String createTime;
        private String deviceMake;
        private String deviceModel;
        private int imageHeight;
        private int imageWidth;
        private float lat;
        private float lon;
        private String orientation;

        public String getColorSpace() {
            return colorSpace;
        }

        public void setColorSpace(String colorSpace) {
            this.colorSpace = colorSpace;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getDeviceMake() {
            return deviceMake;
        }

        public void setDeviceMake(String deviceMake) {
            this.deviceMake = deviceMake;
        }

        public String getDeviceModel() {
            return deviceModel;
        }

        public void setDeviceModel(String deviceModel) {
            this.deviceModel = deviceModel;
        }

        public int getImageHeight() {
            return imageHeight;
        }

        public void setImageHeight(int imageHeight) {
            this.imageHeight = imageHeight;
        }

        public int getImageWidth() {
            return imageWidth;
        }

        public void setImageWidth(int imageWidth) {
            this.imageWidth = imageWidth;
        }

        public float getLat() {
            return lat;
        }

        public void setLat(float lat) {
            this.lat = lat;
        }

        public float getLon() {
            return lon;
        }

        public void setLon(float lon) {
            this.lon = lon;
        }

        public String getOrientation() {
            return orientation;
        }

        public void setOrientation(String orientation) {
            this.orientation = orientation;
        }
    }

    @Override
    public String toString() {
        return "FileModel{" +
                "createdTime='" + createdTime + '\'' +
                ", fileId='" + fileId + '\'' +
                ", fileMd5='" + fileMd5 + '\'' +
                ", fileName='" + fileName + '\'' +
                ", fileSize=" + fileSize +
                ", fileType='" + fileType + '\'' +
                ", imageMetadata=" + imageMetadata +
                '}';
    }
}
