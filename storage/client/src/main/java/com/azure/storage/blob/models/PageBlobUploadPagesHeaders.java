/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.azure.storage.blob.models;

import com.azure.core.implementation.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/**
 * Defines headers for UploadPages operation.
 */
@JacksonXmlRootElement(localName = "PageBlob-UploadPages-Headers")
public final class PageBlobUploadPagesHeaders {
    /**
     * The ETag contains a value that you can use to perform operations
     * conditionally. If the request version is 2011-08-18 or newer, the ETag
     * value will be in quotes.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /**
     * Returns the date and time the container was last modified. Any operation
     * that modifies the blob, including an update of the blob's metadata or
     * properties, changes the last-modified time of the blob.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /**
     * If the blob has an MD5 hash and this operation is to read the full blob,
     * this response header is returned so that the client can check for
     * message content integrity.
     */
    @JsonProperty(value = "Content-MD5")
    private byte[] contentMD5;

    /**
     * The current sequence number for the page blob.
     */
    @JsonProperty(value = "x-ms-blob-sequence-number")
    private Long blobSequenceNumber;

    /**
     * This header uniquely identifies the request that was made and can be
     * used for troubleshooting the request.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String requestId;

    /**
     * Indicates the version of the Blob service used to execute the request.
     * This header is returned for requests made against version 2009-09-19 and
     * above.
     */
    @JsonProperty(value = "x-ms-version")
    private String version;

    /**
     * UTC date/time value generated by the service that indicates the time at
     * which the response was initiated.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    /**
     * The value of this header is set to true if the contents of the request
     * are successfully encrypted using the specified algorithm, and false
     * otherwise.
     */
    @JsonProperty(value = "x-ms-request-server-encrypted")
    private Boolean isServerEncrypted;

    /**
     * The errorCode property.
     */
    @JsonProperty(value = "x-ms-error-code")
    private String errorCode;

    /**
     * Get the eTag value.
     *
     * @return the eTag value.
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set the eTag value.
     *
     * @param eTag the eTag value to set.
     * @return the PageBlobUploadPagesHeaders object itself.
     */
    public PageBlobUploadPagesHeaders withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the lastModified value.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime lastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.dateTime();
    }

    /**
     * Set the lastModified value.
     *
     * @param lastModified the lastModified value to set.
     * @return the PageBlobUploadPagesHeaders object itself.
     */
    public PageBlobUploadPagesHeaders withLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the contentMD5 value.
     *
     * @return the contentMD5 value.
     */
    public byte[] contentMD5() {
        return this.contentMD5;
    }

    /**
     * Set the contentMD5 value.
     *
     * @param contentMD5 the contentMD5 value to set.
     * @return the PageBlobUploadPagesHeaders object itself.
     */
    public PageBlobUploadPagesHeaders withContentMD5(byte[] contentMD5) {
        this.contentMD5 = contentMD5;
        return this;
    }

    /**
     * Get the blobSequenceNumber value.
     *
     * @return the blobSequenceNumber value.
     */
    public Long blobSequenceNumber() {
        return this.blobSequenceNumber;
    }

    /**
     * Set the blobSequenceNumber value.
     *
     * @param blobSequenceNumber the blobSequenceNumber value to set.
     * @return the PageBlobUploadPagesHeaders object itself.
     */
    public PageBlobUploadPagesHeaders withBlobSequenceNumber(Long blobSequenceNumber) {
        this.blobSequenceNumber = blobSequenceNumber;
        return this;
    }

    /**
     * Get the requestId value.
     *
     * @return the requestId value.
     */
    public String requestId() {
        return this.requestId;
    }

    /**
     * Set the requestId value.
     *
     * @param requestId the requestId value to set.
     * @return the PageBlobUploadPagesHeaders object itself.
     */
    public PageBlobUploadPagesHeaders withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version value.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version value.
     *
     * @param version the version value to set.
     * @return the PageBlobUploadPagesHeaders object itself.
     */
    public PageBlobUploadPagesHeaders withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the dateProperty value.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime dateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.dateTime();
    }

    /**
     * Set the dateProperty value.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the PageBlobUploadPagesHeaders object itself.
     */
    public PageBlobUploadPagesHeaders withDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the isServerEncrypted value.
     *
     * @return the isServerEncrypted value.
     */
    public Boolean isServerEncrypted() {
        return this.isServerEncrypted;
    }

    /**
     * Set the isServerEncrypted value.
     *
     * @param isServerEncrypted the isServerEncrypted value to set.
     * @return the PageBlobUploadPagesHeaders object itself.
     */
    public PageBlobUploadPagesHeaders withIsServerEncrypted(Boolean isServerEncrypted) {
        this.isServerEncrypted = isServerEncrypted;
        return this;
    }

    /**
     * Get the errorCode value.
     *
     * @return the errorCode value.
     */
    public String errorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode value.
     *
     * @param errorCode the errorCode value to set.
     * @return the PageBlobUploadPagesHeaders object itself.
     */
    public PageBlobUploadPagesHeaders withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
}
