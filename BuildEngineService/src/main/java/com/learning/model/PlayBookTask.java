/**
 * 
 */
package com.learning.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * @author vbejjanki
 *
 */

@Entity
public class PlayBookTask {

	@Id
	private Long id;

	private String name;

	private boolean isRepetable;

	private boolean isManual;

	private LocalDateTime constnatDateTime;

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

	private int actualDuration;

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

	@ManyToOne
	@JoinColumn(name = "id", nullable = false)
	private PlayBook playBook;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private PredecessorConstarint predConstant;

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

	public LocalDateTime getConstnatDateTime() {
		return constnatDateTime;
	}

	public void setConstnatDateTime(LocalDateTime constnatDateTime) {
		this.constnatDateTime = constnatDateTime;
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

	public int getActualDuration() {
		return actualDuration;
	}

	public void setActualDuration(int actualDuration) {
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

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", isRepetable=" + isRepetable + ", isManual=" + isManual
				+ ", constnatDateTime=" + constnatDateTime + ", actualStartDateandTime=" + actualStartDateandTime
				+ ", actualEndDateandTime=" + actualEndDateandTime + ", memberName=" + memberName + ", ruleSetTagName="
				+ ruleSetTagName + ", apiEnquiryDeployService=" + apiEnquiryDeployService
				+ ", apiUndeployMaintainceService=" + apiUndeployMaintainceService + ", apiVersion=" + apiVersion
				+ ", changemanPackage=" + changemanPackage + ", activityDescription=" + activityDescription
				+ ", displayPoistion=" + displayPoistion + ", isDeleted=" + isDeleted + ", actualDuration="
				+ actualDuration + ", plannedStartDate=" + plannedStartDate + ", plannedEndDate=" + plannedEndDate
				+ ", plannedDuration=" + plannedDuration + ", isValidationRequired=" + isValidationRequired
				+ ", sequenceNumber=" + sequenceNumber + ", executionContactMail=" + executionContactMail
				+ ", uniqueId=" + uniqueId + ", aaasexecutionId=" + aaasexecutionId + ", executionNote=" + executionNote
				+ ", manualActivityDescription=" + manualActivityDescription + ", isCritical=" + isCritical
				+ ", isParent=" + isParent + ", getId()=" + getId() + ", getName()=" + getName() + ", isRepetable()="
				+ isRepetable() + ", isManual()=" + isManual() + ", getConstnatDateTime()=" + getConstnatDateTime()
				+ ", getActualStartDateandTime()=" + getActualStartDateandTime() + ", getActualEndDateandTime()="
				+ getActualEndDateandTime() + ", getMemberName()=" + getMemberName() + ", getRuleSetTagName()="
				+ getRuleSetTagName() + ", isApiEnquiryDeployService()=" + isApiEnquiryDeployService()
				+ ", isApiUndeployMaintainceService()=" + isApiUndeployMaintainceService() + ", getApiVersion()="
				+ getApiVersion() + ", getChangemanPackage()=" + getChangemanPackage() + ", getActivityDescription()="
				+ getActivityDescription() + ", getDisplayPoistion()=" + getDisplayPoistion() + ", isDeleted()="
				+ isDeleted() + ", getActualDuration()=" + getActualDuration() + ", getPlannedStartDate()="
				+ getPlannedStartDate() + ", getPlannedEndDate()=" + getPlannedEndDate() + ", getPlannedDuration()="
				+ getPlannedDuration() + ", isValidationRequired()=" + isValidationRequired() + ", getSequenceNumber()="
				+ getSequenceNumber() + ", getExecutionContactMail()=" + getExecutionContactMail() + ", getUniqueId()="
				+ getUniqueId() + ", getAaasexecutionId()=" + getAaasexecutionId() + ", getExecutionNote()="
				+ getExecutionNote() + ", getManualActivityDescription()=" + getManualActivityDescription()
				+ ", isCritical()=" + isCritical() + ", isParent()=" + isParent() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public PredecessorConstarint getPredConstant() {
		return predConstant;
	}

	public void setPredConstant(PredecessorConstarint predConstant) {
		this.predConstant = predConstant;
	}

	public PlayBook getPlayBook() {
		return playBook;
	}

	public void setPlayBook(PlayBook playBook) {
		this.playBook = playBook;
	}

}
