# MGNREGA
The Mahatma Gandhi National Rural Employment Gurantee Act(MGNREGA) is an Indian Law which gives gurantee rural areas by providing at least 100 days of guranteed wage employment .
a. BDO (Block Development Officer)

b. Gram Panchayat member

A project is created by BDO,which is assigned to corresponding Gram panchayat Members. Gram Panchayat member has acccess to assign to Employees to Complete the Project.<br/>

<!--![Flow Chart1](https://user-images.githubusercontent.com/80202600/223318909-240455f4-8989-4811-9f96-4d378f7b7667.jpg)-->


Features<br/>
BDO and GPM can login and logout.<br/>
BDO can create Project and GPM and provide their detail.<br/>
BDO can see the List of Project, GPM amd Employee's along with all the detail.<br/>
BDO can assign project to GPM amd GPM can assign to Employee.<br/>
GPM can see the list of Employee and Amount receivable till date according to daily wage.<br/>
GPM can only assingn only those project which are assign to them by BDO.<br/>
GPM can only assingn project to Employee.<br/>

<br/>
<h1>Click here to watch presentation video<a href="https://drive.google.com/drive/folders/1goR-namqIyvzPJDyHdRgEKMNwRL9n7mx" target=_blank>Link</a></h1>
Used Tech stacks and Tools<br/>
Java<br/>
MySQL<br/>
Git & GitHub<br/>
JDBC<br/>


mysql> desc bdo;

| Field    | Type        | Null | Key | Default | Extra |
|:-----:
| id       | int         | NO   | PRI | NULL    |       |
| username | varchar(20) | NO   |     | NULL    |       |
| password | varchar(20) | YES  |     | NULL    |       |
| location | varchar(20) | YES  |     | NULL    |       |
| email    | varchar(20) | YES  |     | NULL    |       |

5 rows in set (0.07 sec)

mysql> desc employee;

| Field    | Type        | Null | Key | Default | Extra |
| :----:   |:----------:
| empid    | int         | NO   | PRI | NULL    |       |
| ename    | varchar(20) | YES  |     | NULL    |       |
| age      | int         | YES  |     | NULL    |       |
| location | varchar(20) | YES  |     | NULL    |       |
| wages    | int         | YES  |     | NULL    |       |
| mobilno  | varchar(20) | YES  |     | NULL    |       |
| pid      | int         | YES  | MUL | NULL    |       |
| days     | int         | YES  |     | NULL    |       |

8 rows in set (0.01 sec)

mysql> desc eproj;

| Field  | Type | Null | Key | Default | Extra |

| emp_id | int  | YES  | MUL | NULL    |       |
| p_id   | int  | YES  | MUL | NULL    |       |

2 rows in set (0.01 sec)

mysql> desc gpm;

| Field    | Type        | Null | Key | Default | Extra |

| gpmid    | int         | NO   | PRI | NULL    |       |
| name     | varchar(20) | YES  |     | NULL    |       |
| email    | varchar(20) | YES  |     | NULL    |       |
| password | varchar(20) | YES  |     | NULL    |       |
| location | varchar(20) | YES  |     | NULL    |       |
| mobilno  | varchar(20) | YES  |     | NULL    |       |
| prid     | int         | YES  | MUL | NULL    |       |

7 rows in set (0.01 sec)

mysql> desc project;

| Field    | Type        | Null | Key | Default | Extra |

| projid   | int         | NO   | PRI | NULL    |       |
| name     | varchar(20) | YES  |     | NULL    |       |
| projdesc | varchar(20) | YES  |     | NULL    |       |
| date     | date        | YES  |     | NULL    |       |
| duration | int         | YES  |     | NULL    |       |

5 rows in set (0.01 sec)
