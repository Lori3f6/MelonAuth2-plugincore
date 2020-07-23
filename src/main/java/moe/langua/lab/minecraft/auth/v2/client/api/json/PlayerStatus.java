package moe.langua.lab.minecraft.auth.v2.client.api.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.UUID;

public class PlayerStatus {
    @SerializedName("uniqueID")
    @Expose
    private String uniqueID;
    @SerializedName("verified")
    @Expose
    private Boolean verified;
    @SerializedName("commitTime")
    @Expose
    private Long commitTime;
    @SerializedName("verificationLife")
    @Expose
    private Long verificationLife;

    public static PlayerStatus get(UUID uniqueID, boolean verified, Long commitTime, Long verificationLife) {
        PlayerStatus statusInstance = new PlayerStatus();
        statusInstance.uniqueID = uniqueID.toString();
        statusInstance.verified = verified;
        statusInstance.commitTime = commitTime;
        statusInstance.verificationLife = verificationLife;
        return statusInstance;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public Boolean getVerified() {
        return verified;
    }

    public Long getCommitTime() {
        return commitTime;
    }

    public Long getVerificationLife() {
        return verificationLife;
    }
}