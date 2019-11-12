INSERT INTO TBL_PLAYBOOK (id,name,description,isLocked,isDeleted) VALUES
  (1,'playBook1','Parent and Child',FALSE,FALSE),
  (2,'playBook2','Predecessors',FALSE,FALSE),
  (3,'playBook3','Parent/Child with Predecessors',FALSE,FALSE),
  (4,'playBook4','PlayBook Locked',TRUE,FALSE),
  (5,'playBook5','PlayBook Skipped Tasks',FALSE,FALSE),
  (6,'playBook6','PlayBook Manual Tasks',FALSE,FALSE);
  

INSERT INTO TBL_PLAYBOOK_TASKS (id,name,description,isLocked,isDeleted) VALUES  
	(1,'Task1',FALSE,FALSE,FALSE);