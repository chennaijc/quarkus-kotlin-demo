CREATE TABLE IF NOT EXISTS Book
(
    Id        int,
    Title varchar(255),
    PublishedOn  int
);

CREATE TABLE IF NOT EXISTS SprintBacklog (
    Id Int,
    ItemId varchar(10),
    Summary varchar(255),
    Priority varchar(15),
    Assigned varchar(100),
    Status varchar(15),
    StoryPoints Int

);

CREATE TABLE IF NOT EXISTS SubTasks (
    Id Int,
    SubTaskId varchar(10),
    Summary varchar(255),
    Priority varchar(15),
    Assigned varchar(100),
    Status varchar(15)
);