INSERT INTO TBL_PLAYBOOK (id,name,description,isLocked,isDeleted) VALUES
  (1,'playBook1','Parent and Child',FALSE,FALSE),
  (2,'playBook2','Predecessors',FALSE,FALSE),
  (3,'playBook3','Parent/Child with Predecessors',FALSE,FALSE),
  (4,'playBook4','PlayBook Locked',TRUE,FALSE),
  (5,'playBook5','PlayBook Skipped Tasks',FALSE,FALSE),
  (6,'playBook6','PlayBook Manual Tasks',FALSE,FALSE);
  

INSERT INTO TBL_PLAYBOOK_TASKS (id,name,isRepetable,isManual,isParent) VALUES  
	(1,'Task1',FALSE,FALSE,FALSE),
	(2,'Task2',FALSE,FALSE,FALSE),
	(3,'Task3',FALSE,FALSE,FALSE),
	(4,'Task4',FALSE,FALSE,FALSE),
	(5,'Task5',FALSE,FALSE,FALSE),
	(6,'Task6',FALSE,FALSE,FALSE),
	(7,'Task7',FALSE,FALSE,FALSE),
	(8,'Task8',FALSE,FALSE,FALSE),
	(9,'Task9',FALSE,FALSE,FALSE);