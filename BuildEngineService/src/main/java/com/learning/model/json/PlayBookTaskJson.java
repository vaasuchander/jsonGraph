/**
 * 
 */
package com.learning.model.json;

import java.time.LocalDateTime;

/**
 * @author vbejjanki
 *
 */

public class PlayBookTaskJson {

	private Long id;

	private String name;

	private boolean isRepetable;

	private boolean isManual;

	private LocalDateTime constantDateTime;

	private LocalDateTime actualStartDateandTime;

	private LocalDateTime actualEndDateandTime;

	private String memberName;

	private String ruleSetTagName;

	private boolean apiEnquiryDeployService;

	private boolean apiUndeployMaintainceService;

	private String apiVersion;

	private String changemanPackage;

	private String activityDescription;

	private int displayPoistion;

	private boolean isDeleted;

	private Long actualDuration;

	private LocalDateTime plannedStartDate;

	private LocalDateTime plannedEndDate;

	private int plannedDuration;

	private boolean isValidationRequired;

	private int sequenceNumber;

	private String executionContactMail;

	private String uniqueId;

	private String aaasexecutionId;

	private String executionNote;

	private String manualActivityDescription;

	private boolean isCritical;

	private boolean isParent;

	private PlayBookJson playBook;

	private PredecessorConstarintJson predConstant;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isRepetable() {
		return isRepetable;
	}

	public void setRepetable(boolean isRepetable) {
		this.isRepetable = isRepetable;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}

	public LocalDateTime getActualStartDateandTime() {
		return actualStartDateandTime;
	}

	public void setActualStartDateandTime(LocalDateTime actualStartDateandTime) {
		this.actualStartDateandTime = actualStartDateandTime;
	}

	public LocalDateTime getActualEndDateandTime() {
		return actualEndDateandTime;
	}

	public void setActualEndDateandTime(LocalDateTime actualEndDateandTime) {
		this.actualEndDateandTime = actualEndDateandTime;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getRuleSetTagName() {
		return ruleSetTagName;
	}

	public void setRuleSetTagName(String ruleSetTagName) {
		this.ruleSetTagName = ruleSetTagName;
	}

	public boolean isApiEnquiryDeployService() {
		return apiEnquiryDeployService;
	}

	public void setApiEnquiryDeployService(boolean apiEnquiryDeployService) {
		this.apiEnquiryDeployService = apiEnquiryDeployService;
	}

	public boolean isApiUndeployMaintainceService() {
		return apiUndeployMaintainceService;
	}

	public void setApiUndeployMaintainceService(boolean apiUndeployMaintainceService) {
		this.apiUndeployMaintainceService = apiUndeployMaintainceService;
	}

	public String getApiVersion() {
		return apiVersion;
	}

	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public String getChangemanPackage() {
		return changemanPackage;
	}

	public void setChangemanPackage(String changemanPackage) {
		this.changemanPackage = changemanPackage;
	}

	public String getActivityDescription() {
		return activityDescription;
	}

	public void setActivityDescription(String activityDescription) {
		this.activityDescription = activityDescription;
	}

	public int getDisplayPoistion() {
		return displayPoistion;
	}

	public void setDisplayPoistion(int displayPoistion) {
		this.displayPoistion = displayPoistion;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Long getActualDuration() {
		return actualDuration;
	}

	public void setActualDuration(Long actualDuration) {
		this.actualDuration = actualDuration;
	}

	public LocalDateTime getPlannedStartDate() {
		return plannedStartDate;
	}

	public void setPlannedStartDate(LocalDateTime plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}

	public LocalDateTime getPlannedEndDate() {
		return plannedEndDate;
	}

	public void setPlannedEndDate(LocalDateTime plannedEndDate) {
		this.plannedEndDate = plannedEndDate;
	}

	public int getPlannedDuration() {
		return plannedDuration;
	}

	public void setPlannedDuration(int plannedDuration) {
		this.plannedDuration = plannedDuration;
	}

	public boolean isValidationRequired() {
		return isValidationRequired;
	}

	public void setValidationRequired(boolean isValidationRequired) {
		this.isValidationRequired = isValidationRequired;
	}

	public int getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(int sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public String getExecutionContactMail() {
		return executionContactMail;
	}

	public void setExecutionContactMail(String executionContactMail) {
		this.executionContactMail = executionContactMail;
	}

	public String getUniqueId() {
		return uniqueId;
	}

	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}

	public String getAaasexecutionId() {
		return aaasexecutionId;
	}

	public void setAaasexecutionId(String aaasexecutionId) {
		this.aaasexecutionId = aaasexecutionId;
	}

	public String getExecutionNote() {
		return executionNote;
	}

	public void setExecutionNote(String executionNote) {
		this.executionNote = executionNote;
	}

	public String getManualActivityDescription() {
		return manualActivityDescription;
	}

	public void setManualActivityDescription(String manualActivityDescription) {
		this.manualActivityDescription = manualActivityDescription;
	}

	public boolean isCritical() {
		return isCritical;
	}

	public void setCritical(boolean isCritical) {
		this.isCritical = isCritical;
	}

	public boolean isParent() {
		return isParent;
	}

	public void setParent(boolean isParent) {
		this.isParent = isParent;
	}

	public PredecessorConstarintJson getPredConstant() {
		return predConstant;
	}

	public void setPredConstant(PredecessorConstarintJson predConstant) {
		this.predConstant = predConstant;
	}

	public PlayBookJson getPlayBook() {
		return playBook;
	}

	public void setPlayBook(PlayBookJson playBook) {
		this.playBook = playBook;
	}

	public LocalDateTime getConstantDateTime() {
		return constantDateTime;
	}

	public void setConstantDateTime(LocalDateTime constantDateTime) {
		this.constantDateTime = constantDateTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlayBookTaskJson other = (PlayBookTaskJson) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
