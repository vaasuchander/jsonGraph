DROP TABLE IF EXISTS TBL_PLAYBOOK;

CREATE TABLE TBL_PLAYBOOK (
  id INT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  description VARCHAR(250),
  isLocked BOOLEAN,
  isDeleted BOOLEAN
);


DROP TABLE IF EXISTS TBL_PLAYBOOK_TASKS;
  
CREATE TABLE TBL_PLAYBOOK_TASKS (
  id INT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  isRepetable BOOLEAN NOT NULL,
  isManual BOOLEAN NOT NULL,
  constnatDateTime TIMESTAMP,
  actualStartDateandTime TIMESTAMP,
  actualEndDateandTime TIMESTAMP,
  memberName VARCHAR(250),
  ruleSetTagName VARCHAR(250),
  apiEnquiryDeployService BOOLEAN,
  apiUndeployMaintainceService  BOOLEAN,
  apiVersion VARCHAR(250),
  changemanPackage VARCHAR(250),
  activityDescription VARCHAR(250),
  displayPoistion INT,
  isDeleted BOOLEAN,
  actualDuration INT,
  plannedStartDate TIMESTAMP,
  plannedEndDate TIMESTAMP,
  plannedDuration INT,
  isValidationRequired BOOLEAN,
  sequenceNumber INT,
  executionContactMail VARCHAR(250),
  uniqueId VARCHAR(250),
  aaasexecutionId VARCHAR(250),
  executionNote VARCHAR(250),
  manualActivityDescription VARCHAR(250),
  isCritical BOOLEAN,
  isParent BOOLEAN
);

DROP TABLE IF EXISTS TBL_JSON_GRAPHS;
  
CREATE TABLE TBL_JSON_GRAPHS (
  id INT  PRIMARY KEY,
  json CLOB NOT NULL,
  playBookid INT NOT NULL
);