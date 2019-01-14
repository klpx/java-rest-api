package com.messagebird.objects.voicecalls;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class VoiceCallResponse implements Serializable {

    private static final long serialVersionUID = -3429781513863789117L;

    private List<VoiceCallData> data;
    private Map<String, String> _links;

    public List<VoiceCallData> getData() {
        return data;
    }

    public void setData(List<VoiceCallData> data) {
        this.data = data;
    }

    public Map<String, String> get_links() {
        return _links;
    }

    public void set_links(Map<String, String> _links) {
        this._links = _links;
    }

    @Override
    public String toString() {
        return "VoiceCallResponse{" +
                "data=" + data +
                ", _links=" + _links +
                '}';
    }
}