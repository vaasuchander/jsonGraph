INSERT INTO TBL_TASKS (id,name,constraint_Type,parent_Id,predecessor_Id) VALUES
  (1,'Task1','predecessor-FS-no-lag',0,0),
  (2,'Task2','predecessor-FS-no-lag',1,0),
  (3,'Task3','predecessor-FS-no-lag',0,1),
  (4,'Task4','predecessor-FS-no-lag',0,0),
  (5,'Task5','predecessor-FS-no-lag',0,0),
  (6,'Task6','predecessor-FS-no-lag',2,0),
  (7,'Task7','predecessor-FS-no-lag',2,0),
  (8,'Task8','predecessor-FS-no-lag',2,0),
  (9,'Task9','predecessor-FS-no-lag',0,3),
  (10,'Task10','predecessor-FS-no-lag',0,4);