DROP TABLE IF EXISTS score;
CREATE TABLE score(
	id BIGINT(20) AUTO_INCREMENT PRIMARY KEY NOT NULL COMMENT '成绩编号',
	stu_name VARCHAR(30) NOT NULL COMMENT '姓名',
	course VARCHAR(30) NOT NULL COMMENT '课程',
	score DOUBLE(5, 2) COMMENT '成绩'
)ENGINE=InnoDB CHARSET=UTF8 COMMENT '学生表';

INSERT INTO score(stu_name, course, score) VALUES ('甄运鸿','Java',11);
INSERT INTO score(stu_name, course, score) VALUES ('甄运鸿','Html',51);
INSERT INTO score(stu_name, course, score) VALUES ('甄运鸿','Jsp',92);
INSERT INTO score(stu_name, course, score) VALUES ('甄运鸿','Spring',53);
INSERT INTO score(stu_name, course, score) VALUES ('乜紫真','Java',21);
INSERT INTO score(stu_name, course, score) VALUES ('乜紫真','Html',51);
INSERT INTO score(stu_name, course, score) VALUES ('乜紫真','Jsp',27);
INSERT INTO score(stu_name, course, score) VALUES ('乜紫真','Spring',26);
INSERT INTO score(stu_name, course, score) VALUES ('于曜坤','Java',75);
INSERT INTO score(stu_name, course, score) VALUES ('于曜坤','Html',91);
INSERT INTO score(stu_name, course, score) VALUES ('于曜坤','Jsp',63);
INSERT INTO score(stu_name, course, score) VALUES ('于曜坤','Spring',79);
INSERT INTO score(stu_name, course, score) VALUES ('谢冷霜','Java',2);
INSERT INTO score(stu_name, course, score) VALUES ('谢冷霜','Html',38);
INSERT INTO score(stu_name, course, score) VALUES ('谢冷霜','Jsp',82);
INSERT INTO score(stu_name, course, score) VALUES ('谢冷霜','Spring',47);
INSERT INTO score(stu_name, course, score) VALUES ('晁运凯','Java',99);
INSERT INTO score(stu_name, course, score) VALUES ('晁运凯','Html',35);
INSERT INTO score(stu_name, course, score) VALUES ('晁运凯','Jsp',64);
INSERT INTO score(stu_name, course, score) VALUES ('晁运凯','Spring',21);
INSERT INTO score(stu_name, course, score) VALUES ('鄂静枫','Java',63);
INSERT INTO score(stu_name, course, score) VALUES ('鄂静枫','Html',69);
INSERT INTO score(stu_name, course, score) VALUES ('鄂静枫','Jsp',35);
INSERT INTO score(stu_name, course, score) VALUES ('鄂静枫','Spring',39);
INSERT INTO score(stu_name, course, score) VALUES ('查德明','Java',61);
INSERT INTO score(stu_name, course, score) VALUES ('查德明','Html',74);
INSERT INTO score(stu_name, course, score) VALUES ('查德明','Jsp',23);
INSERT INTO score(stu_name, course, score) VALUES ('查德明','Spring',54);
INSERT INTO score(stu_name, course, score) VALUES ('温星腾','Java',14);
INSERT INTO score(stu_name, course, score) VALUES ('温星腾','Html',59);
INSERT INTO score(stu_name, course, score) VALUES ('温星腾','Jsp',36);
INSERT INTO score(stu_name, course, score) VALUES ('温星腾','Spring',60);
INSERT INTO score(stu_name, course, score) VALUES ('暴耘涛','Java',82);
INSERT INTO score(stu_name, course, score) VALUES ('暴耘涛','Html',99);
INSERT INTO score(stu_name, course, score) VALUES ('暴耘涛','Jsp',26);
INSERT INTO score(stu_name, course, score) VALUES ('暴耘涛','Spring',0);
INSERT INTO score(stu_name, course, score) VALUES ('史惜珊','Java',59);
INSERT INTO score(stu_name, course, score) VALUES ('史惜珊','Html',20);
INSERT INTO score(stu_name, course, score) VALUES ('史惜珊','Jsp',36);
INSERT INTO score(stu_name, course, score) VALUES ('史惜珊','Spring',61);
INSERT INTO score(stu_name, course, score) VALUES ('年爱宛南','Java',71);
INSERT INTO score(stu_name, course, score) VALUES ('年爱宛南','Html',42);
INSERT INTO score(stu_name, course, score) VALUES ('年爱宛南','Jsp',59);
INSERT INTO score(stu_name, course, score) VALUES ('年爱宛南','Spring',76);
INSERT INTO score(stu_name, course, score) VALUES ('邰鸿骞','Java',17);
INSERT INTO score(stu_name, course, score) VALUES ('邰鸿骞','Html',11);
INSERT INTO score(stu_name, course, score) VALUES ('邰鸿骞','Jsp',12);
INSERT INTO score(stu_name, course, score) VALUES ('邰鸿骞','Spring',33);
INSERT INTO score(stu_name, course, score) VALUES ('张又亦','Java',98);
INSERT INTO score(stu_name, course, score) VALUES ('张又亦','Html',92);
INSERT INTO score(stu_name, course, score) VALUES ('张又亦','Jsp',85);
INSERT INTO score(stu_name, course, score) VALUES ('张又亦','Spring',75);
INSERT INTO score(stu_name, course, score) VALUES ('通瑞渊','Java',53);
INSERT INTO score(stu_name, course, score) VALUES ('通瑞渊','Html',50);
INSERT INTO score(stu_name, course, score) VALUES ('通瑞渊','Jsp',69);
INSERT INTO score(stu_name, course, score) VALUES ('通瑞渊','Spring',58);
INSERT INTO score(stu_name, course, score) VALUES ('简依丝','Java',17);
INSERT INTO score(stu_name, course, score) VALUES ('简依丝','Html',27);
INSERT INTO score(stu_name, course, score) VALUES ('简依丝','Jsp',10);
INSERT INTO score(stu_name, course, score) VALUES ('简依丝','Spring',73);
INSERT INTO score(stu_name, course, score) VALUES ('左丘千凡','Java',60);
INSERT INTO score(stu_name, course, score) VALUES ('左丘千凡','Html',79);
INSERT INTO score(stu_name, course, score) VALUES ('左丘千凡','Jsp',91);
INSERT INTO score(stu_name, course, score) VALUES ('左丘千凡','Spring',97);
INSERT INTO score(stu_name, course, score) VALUES ('诸葛佳蕊','Java',91);
INSERT INTO score(stu_name, course, score) VALUES ('诸葛佳蕊','Html',21);
INSERT INTO score(stu_name, course, score) VALUES ('诸葛佳蕊','Jsp',12);
INSERT INTO score(stu_name, course, score) VALUES ('诸葛佳蕊','Spring',24);
INSERT INTO score(stu_name, course, score) VALUES ('侯依秋','Java',90);
INSERT INTO score(stu_name, course, score) VALUES ('侯依秋','Html',78);
INSERT INTO score(stu_name, course, score) VALUES ('侯依秋','Jsp',94);
INSERT INTO score(stu_name, course, score) VALUES ('侯依秋','Spring',20);
INSERT INTO score(stu_name, course, score) VALUES ('薄鸿畴','Java',29);
INSERT INTO score(stu_name, course, score) VALUES ('薄鸿畴','Html',99);
INSERT INTO score(stu_name, course, score) VALUES ('薄鸿畴','Jsp',95);
INSERT INTO score(stu_name, course, score) VALUES ('薄鸿畴','Spring',21);
INSERT INTO score(stu_name, course, score) VALUES ('相盼菡','Java',5);
INSERT INTO score(stu_name, course, score) VALUES ('相盼菡','Html',8);
INSERT INTO score(stu_name, course, score) VALUES ('相盼菡','Jsp',0);
INSERT INTO score(stu_name, course, score) VALUES ('相盼菡','Spring',43);
INSERT INTO score(stu_name, course, score) VALUES ('燕觅云','Java',93);
INSERT INTO score(stu_name, course, score) VALUES ('燕觅云','Html',51);
INSERT INTO score(stu_name, course, score) VALUES ('燕觅云','Jsp',71);
INSERT INTO score(stu_name, course, score) VALUES ('燕觅云','Spring',24);
INSERT INTO score(stu_name, course, score) VALUES ('常谷槐','Java',85);
INSERT INTO score(stu_name, course, score) VALUES ('常谷槐','Html',71);
INSERT INTO score(stu_name, course, score) VALUES ('常谷槐','Jsp',50);
INSERT INTO score(stu_name, course, score) VALUES ('常谷槐','Spring',0);
INSERT INTO score(stu_name, course, score) VALUES ('莘怀薇','Java',83);
INSERT INTO score(stu_name, course, score) VALUES ('莘怀薇','Html',19);
INSERT INTO score(stu_name, course, score) VALUES ('莘怀薇','Jsp',48);
INSERT INTO score(stu_name, course, score) VALUES ('莘怀薇','Spring',42);
INSERT INTO score(stu_name, course, score) VALUES ('墨哈子昂','Java',13);
INSERT INTO score(stu_name, course, score) VALUES ('墨哈子昂','Html',31);
INSERT INTO score(stu_name, course, score) VALUES ('墨哈子昂','Jsp',25);
INSERT INTO score(stu_name, course, score) VALUES ('墨哈子昂','Spring',66);
INSERT INTO score(stu_name, course, score) VALUES ('皇甫晓凡','Java',12);
INSERT INTO score(stu_name, course, score) VALUES ('皇甫晓凡','Html',53);
INSERT INTO score(stu_name, course, score) VALUES ('皇甫晓凡','Jsp',61);
INSERT INTO score(stu_name, course, score) VALUES ('皇甫晓凡','Spring',93);
INSERT INTO score(stu_name, course, score) VALUES ('林青亦','Java',26);
INSERT INTO score(stu_name, course, score) VALUES ('林青亦','Html',21);
INSERT INTO score(stu_name, course, score) VALUES ('林青亦','Jsp',13);
INSERT INTO score(stu_name, course, score) VALUES ('林青亦','Spring',14);
INSERT INTO score(stu_name, course, score) VALUES ('万俟鸿羲','Java',87);
INSERT INTO score(stu_name, course, score) VALUES ('万俟鸿羲','Html',28);
INSERT INTO score(stu_name, course, score) VALUES ('万俟鸿羲','Jsp',38);
INSERT INTO score(stu_name, course, score) VALUES ('万俟鸿羲','Spring',50);
INSERT INTO score(stu_name, course, score) VALUES ('阙振平','Java',36);
INSERT INTO score(stu_name, course, score) VALUES ('阙振平','Html',67);
INSERT INTO score(stu_name, course, score) VALUES ('阙振平','Jsp',98);
INSERT INTO score(stu_name, course, score) VALUES ('阙振平','Spring',81);
INSERT INTO score(stu_name, course, score) VALUES ('孔昆皓','Java',79);
INSERT INTO score(stu_name, course, score) VALUES ('孔昆皓','Html',95);
INSERT INTO score(stu_name, course, score) VALUES ('孔昆皓','Jsp',97);
INSERT INTO score(stu_name, course, score) VALUES ('孔昆皓','Spring',31);
INSERT INTO score(stu_name, course, score) VALUES ('令狐昆鹏','Java',67);
INSERT INTO score(stu_name, course, score) VALUES ('令狐昆鹏','Html',6);
INSERT INTO score(stu_name, course, score) VALUES ('令狐昆鹏','Jsp',32);
INSERT INTO score(stu_name, course, score) VALUES ('令狐昆鹏','Spring',9);
INSERT INTO score(stu_name, course, score) VALUES ('莘飞双','Java',95);
INSERT INTO score(stu_name, course, score) VALUES ('莘飞双','Html',93);
INSERT INTO score(stu_name, course, score) VALUES ('莘飞双','Jsp',11);
INSERT INTO score(stu_name, course, score) VALUES ('莘飞双','Spring',8);
INSERT INTO score(stu_name, course, score) VALUES ('乐正昆谊','Java',85);
INSERT INTO score(stu_name, course, score) VALUES ('乐正昆谊','Html',92);
INSERT INTO score(stu_name, course, score) VALUES ('乐正昆谊','Jsp',12);
INSERT INTO score(stu_name, course, score) VALUES ('乐正昆谊','Spring',43);
INSERT INTO score(stu_name, course, score) VALUES ('丁元容','Java',18);
INSERT INTO score(stu_name, course, score) VALUES ('丁元容','Html',58);
INSERT INTO score(stu_name, course, score) VALUES ('丁元容','Jsp',38);
INSERT INTO score(stu_name, course, score) VALUES ('丁元容','Spring',16);
INSERT INTO score(stu_name, course, score) VALUES ('屈语海','Java',42);
INSERT INTO score(stu_name, course, score) VALUES ('屈语海','Html',89);
INSERT INTO score(stu_name, course, score) VALUES ('屈语海','Jsp',53);
INSERT INTO score(stu_name, course, score) VALUES ('屈语海','Spring',50);
INSERT INTO score(stu_name, course, score) VALUES ('边辰锟','Java',79);
INSERT INTO score(stu_name, course, score) VALUES ('边辰锟','Html',26);
INSERT INTO score(stu_name, course, score) VALUES ('边辰锟','Jsp',11);
INSERT INTO score(stu_name, course, score) VALUES ('边辰锟','Spring',83);
INSERT INTO score(stu_name, course, score) VALUES ('於海荣','Java',60);
INSERT INTO score(stu_name, course, score) VALUES ('於海荣','Html',80);
INSERT INTO score(stu_name, course, score) VALUES ('於海荣','Jsp',8);
INSERT INTO score(stu_name, course, score) VALUES ('於海荣','Spring',75);
INSERT INTO score(stu_name, course, score) VALUES ('诸葛昆谊','Java',77);
INSERT INTO score(stu_name, course, score) VALUES ('诸葛昆谊','Html',4);
INSERT INTO score(stu_name, course, score) VALUES ('诸葛昆谊','Jsp',7);
INSERT INTO score(stu_name, course, score) VALUES ('诸葛昆谊','Spring',31);
INSERT INTO score(stu_name, course, score) VALUES ('幸旭鹏','Java',28);
INSERT INTO score(stu_name, course, score) VALUES ('幸旭鹏','Html',83);
INSERT INTO score(stu_name, course, score) VALUES ('幸旭鹏','Jsp',67);
INSERT INTO score(stu_name, course, score) VALUES ('幸旭鹏','Spring',24);
INSERT INTO score(stu_name, course, score) VALUES ('端木俊晖','Java',48);
INSERT INTO score(stu_name, course, score) VALUES ('端木俊晖','Html',53);
INSERT INTO score(stu_name, course, score) VALUES ('端木俊晖','Jsp',47);
INSERT INTO score(stu_name, course, score) VALUES ('端木俊晖','Spring',24);
INSERT INTO score(stu_name, course, score) VALUES ('郜迎丝','Java',99);
INSERT INTO score(stu_name, course, score) VALUES ('郜迎丝','Html',25);
INSERT INTO score(stu_name, course, score) VALUES ('郜迎丝','Jsp',94);
INSERT INTO score(stu_name, course, score) VALUES ('郜迎丝','Spring',55);
INSERT INTO score(stu_name, course, score) VALUES ('查浩广','Java',63);
INSERT INTO score(stu_name, course, score) VALUES ('查浩广','Html',67);
INSERT INTO score(stu_name, course, score) VALUES ('查浩广','Jsp',36);
INSERT INTO score(stu_name, course, score) VALUES ('查浩广','Spring',11);
INSERT INTO score(stu_name, course, score) VALUES ('鲜于鸿煊','Java',51);
INSERT INTO score(stu_name, course, score) VALUES ('鲜于鸿煊','Html',68);
INSERT INTO score(stu_name, course, score) VALUES ('鲜于鸿煊','Jsp',57);
INSERT INTO score(stu_name, course, score) VALUES ('鲜于鸿煊','Spring',23);
INSERT INTO score(stu_name, course, score) VALUES ('欧阳梦秋','Java',2);
INSERT INTO score(stu_name, course, score) VALUES ('欧阳梦秋','Html',61);
INSERT INTO score(stu_name, course, score) VALUES ('欧阳梦秋','Jsp',82);
INSERT INTO score(stu_name, course, score) VALUES ('欧阳梦秋','Spring',7);
INSERT INTO score(stu_name, course, score) VALUES ('郦景明','Java',30);
INSERT INTO score(stu_name, course, score) VALUES ('郦景明','Html',39);
INSERT INTO score(stu_name, course, score) VALUES ('郦景明','Jsp',67);
INSERT INTO score(stu_name, course, score) VALUES ('郦景明','Spring',55);
INSERT INTO score(stu_name, course, score) VALUES ('乜昆鹏','Java',57);
INSERT INTO score(stu_name, course, score) VALUES ('乜昆鹏','Html',5);
INSERT INTO score(stu_name, course, score) VALUES ('乜昆鹏','Jsp',24);
INSERT INTO score(stu_name, course, score) VALUES ('乜昆鹏','Spring',75);
INSERT INTO score(stu_name, course, score) VALUES ('宫智刚','Java',68);
INSERT INTO score(stu_name, course, score) VALUES ('宫智刚','Html',25);
INSERT INTO score(stu_name, course, score) VALUES ('宫智刚','Jsp',35);
INSERT INTO score(stu_name, course, score) VALUES ('宫智刚','Spring',13);
INSERT INTO score(stu_name, course, score) VALUES ('宦智伟','Java',7);
INSERT INTO score(stu_name, course, score) VALUES ('宦智伟','Html',62);
INSERT INTO score(stu_name, course, score) VALUES ('宦智伟','Jsp',9);
INSERT INTO score(stu_name, course, score) VALUES ('宦智伟','Spring',33);
INSERT INTO score(stu_name, course, score) VALUES ('赫连雅芝','Java',75);
INSERT INTO score(stu_name, course, score) VALUES ('赫连雅芝','Html',9);
INSERT INTO score(stu_name, course, score) VALUES ('赫连雅芝','Jsp',96);
INSERT INTO score(stu_name, course, score) VALUES ('赫连雅芝','Spring',93);
INSERT INTO score(stu_name, course, score) VALUES ('侯鸿福','Java',17);
INSERT INTO score(stu_name, course, score) VALUES ('侯鸿福','Html',52);
INSERT INTO score(stu_name, course, score) VALUES ('侯鸿福','Jsp',6);
INSERT INTO score(stu_name, course, score) VALUES ('侯鸿福','Spring',69);
INSERT INTO score(stu_name, course, score) VALUES ('匡依伊','Java',9);
INSERT INTO score(stu_name, course, score) VALUES ('匡依伊','Html',19);
INSERT INTO score(stu_name, course, score) VALUES ('匡依伊','Jsp',47);
INSERT INTO score(stu_name, course, score) VALUES ('匡依伊','Spring',7);
INSERT INTO score(stu_name, course, score) VALUES ('莘昊宇','Java',78);
INSERT INTO score(stu_name, course, score) VALUES ('莘昊宇','Html',78);
INSERT INTO score(stu_name, course, score) VALUES ('莘昊宇','Jsp',59);
INSERT INTO score(stu_name, course, score) VALUES ('莘昊宇','Spring',89);
INSERT INTO score(stu_name, course, score) VALUES ('支绿蝶','Java',56);
INSERT INTO score(stu_name, course, score) VALUES ('支绿蝶','Html',4);
INSERT INTO score(stu_name, course, score) VALUES ('支绿蝶','Jsp',33);
INSERT INTO score(stu_name, course, score) VALUES ('支绿蝶','Spring',33);
INSERT INTO score(stu_name, course, score) VALUES ('夏侯映之','Java',59);
INSERT INTO score(stu_name, course, score) VALUES ('夏侯映之','Html',31);
INSERT INTO score(stu_name, course, score) VALUES ('夏侯映之','Jsp',17);
INSERT INTO score(stu_name, course, score) VALUES ('夏侯映之','Spring',29);
INSERT INTO score(stu_name, course, score) VALUES ('舒曜坤','Java',26);
INSERT INTO score(stu_name, course, score) VALUES ('舒曜坤','Html',53);
INSERT INTO score(stu_name, course, score) VALUES ('舒曜坤','Jsp',92);
INSERT INTO score(stu_name, course, score) VALUES ('舒曜坤','Spring',10);
INSERT INTO score(stu_name, course, score) VALUES ('喻荷柳','Java',25);
INSERT INTO score(stu_name, course, score) VALUES ('喻荷柳','Html',4);
INSERT INTO score(stu_name, course, score) VALUES ('喻荷柳','Jsp',82);
INSERT INTO score(stu_name, course, score) VALUES ('喻荷柳','Spring',6);
INSERT INTO score(stu_name, course, score) VALUES ('广思菱','Java',16);
INSERT INTO score(stu_name, course, score) VALUES ('广思菱','Html',80);
INSERT INTO score(stu_name, course, score) VALUES ('广思菱','Jsp',64);
INSERT INTO score(stu_name, course, score) VALUES ('广思菱','Spring',5);
INSERT INTO score(stu_name, course, score) VALUES ('平昌淼','Java',20);
INSERT INTO score(stu_name, course, score) VALUES ('平昌淼','Html',54);
INSERT INTO score(stu_name, course, score) VALUES ('平昌淼','Jsp',0);
INSERT INTO score(stu_name, course, score) VALUES ('平昌淼','Spring',49);
INSERT INTO score(stu_name, course, score) VALUES ('霍曼冬','Java',3);
INSERT INTO score(stu_name, course, score) VALUES ('霍曼冬','Html',8);
INSERT INTO score(stu_name, course, score) VALUES ('霍曼冬','Jsp',26);
INSERT INTO score(stu_name, course, score) VALUES ('霍曼冬','Spring',27);
INSERT INTO score(stu_name, course, score) VALUES ('宦冰夏','Java',16);
INSERT INTO score(stu_name, course, score) VALUES ('宦冰夏','Html',3);
INSERT INTO score(stu_name, course, score) VALUES ('宦冰夏','Jsp',88);
INSERT INTO score(stu_name, course, score) VALUES ('宦冰夏','Spring',14);
INSERT INTO score(stu_name, course, score) VALUES ('盛瀚玥','Java',87);
INSERT INTO score(stu_name, course, score) VALUES ('盛瀚玥','Html',61);
INSERT INTO score(stu_name, course, score) VALUES ('盛瀚玥','Jsp',8);
INSERT INTO score(stu_name, course, score) VALUES ('盛瀚玥','Spring',45);
INSERT INTO score(stu_name, course, score) VALUES ('谢瀚彭','Java',18);
INSERT INTO score(stu_name, course, score) VALUES ('谢瀚彭','Html',7);
INSERT INTO score(stu_name, course, score) VALUES ('谢瀚彭','Jsp',47);
INSERT INTO score(stu_name, course, score) VALUES ('谢瀚彭','Spring',90);
INSERT INTO score(stu_name, course, score) VALUES ('桂昊伟','Java',77);
INSERT INTO score(stu_name, course, score) VALUES ('桂昊伟','Html',45);
INSERT INTO score(stu_name, course, score) VALUES ('桂昊伟','Jsp',92);
INSERT INTO score(stu_name, course, score) VALUES ('桂昊伟','Spring',73);
INSERT INTO score(stu_name, course, score) VALUES ('钟离德曜','Java',40);
INSERT INTO score(stu_name, course, score) VALUES ('钟离德曜','Html',35);
INSERT INTO score(stu_name, course, score) VALUES ('钟离德曜','Jsp',75);
INSERT INTO score(stu_name, course, score) VALUES ('钟离德曜','Spring',27);
INSERT INTO score(stu_name, course, score) VALUES ('益运恒','Java',39);
INSERT INTO score(stu_name, course, score) VALUES ('益运恒','Html',38);
INSERT INTO score(stu_name, course, score) VALUES ('益运恒','Jsp',54);
INSERT INTO score(stu_name, course, score) VALUES ('益运恒','Spring',98);
INSERT INTO score(stu_name, course, score) VALUES ('杜秋灵','Java',62);
INSERT INTO score(stu_name, course, score) VALUES ('杜秋灵','Html',62);
INSERT INTO score(stu_name, course, score) VALUES ('杜秋灵','Jsp',88);
INSERT INTO score(stu_name, course, score) VALUES ('杜秋灵','Spring',98);
INSERT INTO score(stu_name, course, score) VALUES ('呼延德昌','Java',39);
INSERT INTO score(stu_name, course, score) VALUES ('呼延德昌','Html',56);
INSERT INTO score(stu_name, course, score) VALUES ('呼延德昌','Jsp',98);
INSERT INTO score(stu_name, course, score) VALUES ('呼延德昌','Spring',99);
INSERT INTO score(stu_name, course, score) VALUES ('仇昆纶','Java',13);
INSERT INTO score(stu_name, course, score) VALUES ('仇昆纶','Html',8);
INSERT INTO score(stu_name, course, score) VALUES ('仇昆纶','Jsp',51);
INSERT INTO score(stu_name, course, score) VALUES ('仇昆纶','Spring',4);
INSERT INTO score(stu_name, course, score) VALUES ('常昆琦','Java',64);
INSERT INTO score(stu_name, course, score) VALUES ('常昆琦','Html',50);
INSERT INTO score(stu_name, course, score) VALUES ('常昆琦','Jsp',64);
INSERT INTO score(stu_name, course, score) VALUES ('常昆琦','Spring',14);
INSERT INTO score(stu_name, course, score) VALUES ('商牟浩气','Java',87);
INSERT INTO score(stu_name, course, score) VALUES ('商牟浩气','Html',19);
INSERT INTO score(stu_name, course, score) VALUES ('商牟浩气','Jsp',32);
INSERT INTO score(stu_name, course, score) VALUES ('商牟浩气','Spring',71);
INSERT INTO score(stu_name, course, score) VALUES ('夹谷高旻','Java',97);
INSERT INTO score(stu_name, course, score) VALUES ('夹谷高旻','Html',73);
INSERT INTO score(stu_name, course, score) VALUES ('夹谷高旻','Jsp',68);
INSERT INTO score(stu_name, course, score) VALUES ('夹谷高旻','Spring',27);
INSERT INTO score(stu_name, course, score) VALUES ('蒋华晖','Java',97);
INSERT INTO score(stu_name, course, score) VALUES ('蒋华晖','Html',4);
INSERT INTO score(stu_name, course, score) VALUES ('蒋华晖','Jsp',91);
INSERT INTO score(stu_name, course, score) VALUES ('蒋华晖','Spring',99);
INSERT INTO score(stu_name, course, score) VALUES ('熊惜梦','Java',45);
INSERT INTO score(stu_name, course, score) VALUES ('熊惜梦','Html',17);
INSERT INTO score(stu_name, course, score) VALUES ('熊惜梦','Jsp',6);
INSERT INTO score(stu_name, course, score) VALUES ('熊惜梦','Spring',61);
INSERT INTO score(stu_name, course, score) VALUES ('叶智宇','Java',17);
INSERT INTO score(stu_name, course, score) VALUES ('叶智宇','Html',36);
INSERT INTO score(stu_name, course, score) VALUES ('叶智宇','Jsp',80);
INSERT INTO score(stu_name, course, score) VALUES ('叶智宇','Spring',53);
INSERT INTO score(stu_name, course, score) VALUES ('广念波','Java',29);
INSERT INTO score(stu_name, course, score) VALUES ('广念波','Html',73);
INSERT INTO score(stu_name, course, score) VALUES ('广念波','Jsp',45);
INSERT INTO score(stu_name, course, score) VALUES ('广念波','Spring',39);
INSERT INTO score(stu_name, course, score) VALUES ('巴旭尧','Java',76);
INSERT INTO score(stu_name, course, score) VALUES ('巴旭尧','Html',53);
INSERT INTO score(stu_name, course, score) VALUES ('巴旭尧','Jsp',76);
INSERT INTO score(stu_name, course, score) VALUES ('巴旭尧','Spring',7);
INSERT INTO score(stu_name, course, score) VALUES ('方晨朗','Java',97);
INSERT INTO score(stu_name, course, score) VALUES ('方晨朗','Html',54);
INSERT INTO score(stu_name, course, score) VALUES ('方晨朗','Jsp',20);
INSERT INTO score(stu_name, course, score) VALUES ('方晨朗','Spring',64);
INSERT INTO score(stu_name, course, score) VALUES ('符元蝶','Java',40);
INSERT INTO score(stu_name, course, score) VALUES ('符元蝶','Html',29);
INSERT INTO score(stu_name, course, score) VALUES ('符元蝶','Jsp',5);
INSERT INTO score(stu_name, course, score) VALUES ('符元蝶','Spring',98);
INSERT INTO score(stu_name, course, score) VALUES ('汲彦昌','Java',1);
INSERT INTO score(stu_name, course, score) VALUES ('汲彦昌','Html',96);
INSERT INTO score(stu_name, course, score) VALUES ('汲彦昌','Jsp',26);
INSERT INTO score(stu_name, course, score) VALUES ('汲彦昌','Spring',25);
INSERT INTO score(stu_name, course, score) VALUES ('索天曼','Java',15);
INSERT INTO score(stu_name, course, score) VALUES ('索天曼','Html',94);
INSERT INTO score(stu_name, course, score) VALUES ('索天曼','Jsp',95);
INSERT INTO score(stu_name, course, score) VALUES ('索天曼','Spring',29);
INSERT INTO score(stu_name, course, score) VALUES ('赫连翠彤','Java',88);
INSERT INTO score(stu_name, course, score) VALUES ('赫连翠彤','Html',38);
INSERT INTO score(stu_name, course, score) VALUES ('赫连翠彤','Jsp',19);
INSERT INTO score(stu_name, course, score) VALUES ('赫连翠彤','Spring',80);
INSERT INTO score(stu_name, course, score) VALUES ('郜昊磊','Java',90);
INSERT INTO score(stu_name, course, score) VALUES ('郜昊磊','Html',25);
INSERT INTO score(stu_name, course, score) VALUES ('郜昊磊','Jsp',37);
INSERT INTO score(stu_name, course, score) VALUES ('郜昊磊','Spring',16);
INSERT INTO score(stu_name, course, score) VALUES ('广昊伟','Java',95);
INSERT INTO score(stu_name, course, score) VALUES ('广昊伟','Html',52);
INSERT INTO score(stu_name, course, score) VALUES ('广昊伟','Jsp',9);
INSERT INTO score(stu_name, course, score) VALUES ('广昊伟','Spring',59);
INSERT INTO score(stu_name, course, score) VALUES ('昝炫明','Java',25);
INSERT INTO score(stu_name, course, score) VALUES ('昝炫明','Html',80);
INSERT INTO score(stu_name, course, score) VALUES ('昝炫明','Jsp',70);
INSERT INTO score(stu_name, course, score) VALUES ('昝炫明','Spring',42);
INSERT INTO score(stu_name, course, score) VALUES ('巩芷容','Java',16);
INSERT INTO score(stu_name, course, score) VALUES ('巩芷容','Html',70);
INSERT INTO score(stu_name, course, score) VALUES ('巩芷容','Jsp',69);
INSERT INTO score(stu_name, course, score) VALUES ('巩芷容','Spring',22);
INSERT INTO score(stu_name, course, score) VALUES ('黎昆谊','Java',21);
INSERT INTO score(stu_name, course, score) VALUES ('黎昆谊','Html',69);
INSERT INTO score(stu_name, course, score) VALUES ('黎昆谊','Jsp',0);
INSERT INTO score(stu_name, course, score) VALUES ('黎昆谊','Spring',16);
INSERT INTO score(stu_name, course, score) VALUES ('欧阳晓昕','Java',14);
INSERT INTO score(stu_name, course, score) VALUES ('欧阳晓昕','Html',19);
INSERT INTO score(stu_name, course, score) VALUES ('欧阳晓昕','Jsp',27);
INSERT INTO score(stu_name, course, score) VALUES ('欧阳晓昕','Spring',34);
INSERT INTO score(stu_name, course, score) VALUES ('石明宇','Java',93);
INSERT INTO score(stu_name, course, score) VALUES ('石明宇','Html',1);
INSERT INTO score(stu_name, course, score) VALUES ('石明宇','Jsp',59);
INSERT INTO score(stu_name, course, score) VALUES ('石明宇','Spring',38);
INSERT INTO score(stu_name, course, score) VALUES ('井静曼','Java',49);
INSERT INTO score(stu_name, course, score) VALUES ('井静曼','Html',28);
INSERT INTO score(stu_name, course, score) VALUES ('井静曼','Jsp',72);
INSERT INTO score(stu_name, course, score) VALUES ('井静曼','Spring',7);
INSERT INTO score(stu_name, course, score) VALUES ('长孙傲薇','Java',15);
INSERT INTO score(stu_name, course, score) VALUES ('长孙傲薇','Html',4);
INSERT INTO score(stu_name, course, score) VALUES ('长孙傲薇','Jsp',8);
INSERT INTO score(stu_name, course, score) VALUES ('长孙傲薇','Spring',48);
INSERT INTO score(stu_name, course, score) VALUES ('阴昊然','Java',47);
INSERT INTO score(stu_name, course, score) VALUES ('阴昊然','Html',47);
INSERT INTO score(stu_name, course, score) VALUES ('阴昊然','Jsp',19);
INSERT INTO score(stu_name, course, score) VALUES ('阴昊然','Spring',37);
INSERT INTO score(stu_name, course, score) VALUES ('徐鸿光','Java',83);
INSERT INTO score(stu_name, course, score) VALUES ('徐鸿光','Html',11);
INSERT INTO score(stu_name, course, score) VALUES ('徐鸿光','Jsp',26);
INSERT INTO score(stu_name, course, score) VALUES ('徐鸿光','Spring',30);
INSERT INTO score(stu_name, course, score) VALUES ('闻海昌','Java',94);
INSERT INTO score(stu_name, course, score) VALUES ('闻海昌','Html',89);
INSERT INTO score(stu_name, course, score) VALUES ('闻海昌','Jsp',92);
INSERT INTO score(stu_name, course, score) VALUES ('闻海昌','Spring',72);
INSERT INTO score(stu_name, course, score) VALUES ('蓟鸿远','Java',69);
INSERT INTO score(stu_name, course, score) VALUES ('蓟鸿远','Html',10);
INSERT INTO score(stu_name, course, score) VALUES ('蓟鸿远','Jsp',34);
INSERT INTO score(stu_name, course, score) VALUES ('蓟鸿远','Spring',12);
INSERT INTO score(stu_name, course, score) VALUES ('桓香薇','Java',74);
INSERT INTO score(stu_name, course, score) VALUES ('桓香薇','Html',76);
INSERT INTO score(stu_name, course, score) VALUES ('桓香薇','Jsp',0);
INSERT INTO score(stu_name, course, score) VALUES ('桓香薇','Spring',90);
INSERT INTO score(stu_name, course, score) VALUES ('包昆颉','Java',47);
INSERT INTO score(stu_name, course, score) VALUES ('包昆颉','Html',56);
INSERT INTO score(stu_name, course, score) VALUES ('包昆颉','Jsp',51);
INSERT INTO score(stu_name, course, score) VALUES ('包昆颉','Spring',57);
INSERT INTO score(stu_name, course, score) VALUES ('钟灵珊','Java',55);
INSERT INTO score(stu_name, course, score) VALUES ('钟灵珊','Html',22);
INSERT INTO score(stu_name, course, score) VALUES ('钟灵珊','Jsp',71);
INSERT INTO score(stu_name, course, score) VALUES ('钟灵珊','Spring',62);
INSERT INTO score(stu_name, course, score) VALUES ('阚昊伟','Java',58);
INSERT INTO score(stu_name, course, score) VALUES ('阚昊伟','Html',95);
INSERT INTO score(stu_name, course, score) VALUES ('阚昊伟','Jsp',72);
INSERT INTO score(stu_name, course, score) VALUES ('阚昊伟','Spring',31);
INSERT INTO score(stu_name, course, score) VALUES ('昝以山','Java',79);
INSERT INTO score(stu_name, course, score) VALUES ('昝以山','Html',39);
INSERT INTO score(stu_name, course, score) VALUES ('昝以山','Jsp',60);
INSERT INTO score(stu_name, course, score) VALUES ('昝以山','Spring',78);
INSERT INTO score(stu_name, course, score) VALUES ('荣曜坤','Java',54);
INSERT INTO score(stu_name, course, score) VALUES ('荣曜坤','Html',83);
INSERT INTO score(stu_name, course, score) VALUES ('荣曜坤','Jsp',1);
INSERT INTO score(stu_name, course, score) VALUES ('荣曜坤','Spring',1);
INSERT INTO score(stu_name, course, score) VALUES ('丌官若松','Java',89);
INSERT INTO score(stu_name, course, score) VALUES ('丌官若松','Html',85);
INSERT INTO score(stu_name, course, score) VALUES ('丌官若松','Jsp',31);
INSERT INTO score(stu_name, course, score) VALUES ('丌官若松','Spring',93);
