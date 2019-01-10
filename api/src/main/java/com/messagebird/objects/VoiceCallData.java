package com.messagebird.objects;

import java.io.Serializable;
import java.util.Date;

public class VoiceCallData implements Serializable {

    private static final long serialVersionUID = -7586467741622154429L;

    private String id;
    private VoiceCallStatus status;
    private String source;
    private String destination;
    private Date createdAt;
    private Date updatedAt;
    private Date endedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VoiceCallStatus getStatus() {
        return status;
    }

    public void setStatus(VoiceCallStatus status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getEndedAt() {
        return endedAt;
    }

    public void setEndedAt(Date endedAt) {
        this.endedAt = endedAt;
    }

    @Override
    public String toString() {
        return "VoiceCallData{" +
                "id='" + id + '\'' +
                ", status=" + status +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", endedAt=" + endedAt +
                '}';
    }
}
