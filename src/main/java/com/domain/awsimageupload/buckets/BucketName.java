package com.domain.awsimageupload.buckets;

public enum BucketName {

    PROFILE_IMAGE("malex-image-uploader");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
