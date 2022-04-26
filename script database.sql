use event;
insert into event
values(1,'Somchai Jaidee (OR-7)','somchai.jai@mail.kmutt.ac.th','DevOps/Infra Clinic','2022-04-23 13:30:00',30,null);
insert into event
values(2,'Somsri Rakdee (SJ-3)','somsri.rak@mail.kmutt.ac.th','Project Magement Clinic','2022-05-27 09:30:00',30,"ขอปรึกษาปัญหาเพื่อนไม่ช่วยงาน");
insert into event
values(3,'สมเกียรติ ขยันเรียน กลุ่มTT-4','somkiat.kay@kmutt.ac.th','Database Clinic','2022-04-23 16:30:00',15,null);


insert into eventcategory
values(1,'Project Magement Clinic','ตารางนัดหมายนี้ใช้สำหรับนัดหมาย project management clinic ในวิชา INT221 intergrated project I ให้นักศึกษาเตรียมเอกสารที่เกี่ยวข้องเพื่อแสดงระหว่างขอคำปรึกษา',30);
insert into eventcategory
values(2,'DevOps/Infra Clinic','Use this event category for DevOps/Infra clinic',20);
insert into eventcategory
values(3,'Database Clinic','ตารางนัดหมายนี้ใช้สำหรับนัดหมาย database clinic ในวิชา INT221 integrated project I',15);
insert into eventcategory
values(4,'Client-side Clinic','ตารางนัดหมายนี้ใช้สำหรับนัดหมาย client-side clinic ในวิชา INT221 integrated project I',30);
insert into eventcategory
values(5,'Server-side Clinic',null,30);
commit;