package com.paga.business.rest.client.response;

public class GetMerchantsResponseItem {

    private String name;
    private String uuid;
    private String displayName;
    private String description;

    public GetMerchantsResponseItem() {
    }

    public GetMerchantsResponseItem(String name, String uuid, String displayName, String description) {
        this.name = name;
        this.uuid = uuid;
        this.displayName = displayName;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "GetMerchantsResponseItem{" +
                "name='" + name + '\'' +
                ", uuid='" + uuid + '\'' +
                ", displayName='" + displayName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
