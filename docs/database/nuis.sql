-- phpMyAdmin SQL Dump
-- version 4.6.6
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: 2017-04-20 09:45:23
-- 服务器版本： 5.7.17
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `nuis`
--

-- --------------------------------------------------------

--
-- 表的结构 `announcement`
--

CREATE TABLE `announcement` (
  `announcement_id` int(11) NOT NULL COMMENT '公告编号',
  `type` varchar(45) DEFAULT NULL COMMENT '公告类型',
  `title` varchar(45) DEFAULT NULL COMMENT '标题',
  `subject` varchar(45) DEFAULT NULL COMMENT '内容',
  `rel_users` varchar(45) DEFAULT NULL COMMENT '接收人列表',
  `status` varchar(45) DEFAULT NULL COMMENT '状态',
  `create_time` varchar(45) DEFAULT NULL COMMENT '创建时间',
  `user_id` int(11) NOT NULL COMMENT '发布人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='公告';

--
-- 转存表中的数据 `announcement`
--

INSERT INTO `announcement` (`announcement_id`, `type`, `title`, `subject`, `rel_users`, `status`, `create_time`, `user_id`) VALUES
(2, '类型1', '公告1', '你好', 'zhangsan', 'onTime', '2017年04月20日 17时38分12秒', 1);

-- --------------------------------------------------------

--
-- 表的结构 `email_template`
--

CREATE TABLE `email_template` (
  `email_template_id` int(11) NOT NULL COMMENT '邮件模板编号',
  `type` varchar(45) DEFAULT NULL COMMENT '类型',
  `subject` varchar(45) DEFAULT NULL COMMENT '主体',
  `title` varchar(45) DEFAULT NULL COMMENT '标题'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='邮件模板';

-- --------------------------------------------------------

--
-- 表的结构 `log`
--

CREATE TABLE `log` (
  `log_id` int(11) NOT NULL COMMENT '日志编号',
  `type` varchar(45) DEFAULT NULL COMMENT '类型',
  `info` varchar(45) DEFAULT NULL COMMENT '日志信息',
  `actor` varchar(45) DEFAULT NULL COMMENT '相关用户',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `status` char(4) DEFAULT NULL COMMENT '状态值'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统日志';

-- --------------------------------------------------------

--
-- 表的结构 `meeting_minutes`
--

CREATE TABLE `meeting_minutes` (
  `meeting_minutes_id` int(11) NOT NULL COMMENT '会议纪要编号',
  `dept_id` varchar(45) DEFAULT NULL COMMENT '部门编号',
  `subject` varchar(45) DEFAULT NULL COMMENT '内容',
  `create_time` varchar(45) DEFAULT NULL COMMENT '创建时间',
  `user_id` int(11) NOT NULL COMMENT '发布人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='会议纪要';

-- --------------------------------------------------------

--
-- 表的结构 `office_supplies`
--

CREATE TABLE `office_supplies` (
  `office_supplies_id` int(11) NOT NULL COMMENT '办公物品编号',
  `name` varchar(45) DEFAULT NULL COMMENT '物品名称',
  `type` varchar(45) DEFAULT NULL COMMENT '类型',
  `description` varchar(45) DEFAULT NULL COMMENT '描述',
  `create_time` varchar(45) DEFAULT NULL COMMENT '创建时间',
  `status` varchar(45) DEFAULT NULL COMMENT '状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='办公物品';

-- --------------------------------------------------------

--
-- 表的结构 `rental_record`
--

CREATE TABLE `rental_record` (
  `rental_record_id` int(11) NOT NULL COMMENT '租借记录号',
  `create_time` varchar(45) DEFAULT NULL COMMENT '租借时间',
  `return_time` varchar(45) DEFAULT NULL COMMENT '归还时间',
  `status` varchar(45) DEFAULT NULL COMMENT '状态',
  `user_id` int(11) NOT NULL COMMENT '租借人',
  `stock_id` int(11) NOT NULL COMMENT '物品库存编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='租借记录';

-- --------------------------------------------------------

--
-- 表的结构 `repair`
--

CREATE TABLE `repair` (
  `repair_id` int(11) NOT NULL COMMENT '报修编号',
  `type` varchar(45) DEFAULT NULL COMMENT '报修类型',
  `subject` varchar(255) DEFAULT NULL COMMENT '报修内容',
  `create_time` bigint(20) DEFAULT NULL COMMENT '创建时间',
  `status` char(4) DEFAULT NULL COMMENT '记录状态',
  `transactor` int(11) NOT NULL COMMENT '记录人'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='报修';

-- --------------------------------------------------------

--
-- 表的结构 `settings`
--

CREATE TABLE `settings` (
  `settings_code` varchar(20) NOT NULL COMMENT '配置代码',
  `type` varchar(45) DEFAULT NULL COMMENT '类型',
  `name` varchar(45) DEFAULT NULL COMMENT '名称',
  `value` varchar(45) DEFAULT NULL COMMENT '配置值',
  `status` varchar(45) DEFAULT NULL COMMENT '状态'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统配置';

-- --------------------------------------------------------

--
-- 表的结构 `statistic`
--

CREATE TABLE `statistic` (
  `statistic_id` int(11) NOT NULL COMMENT '统计编号',
  `type` varchar(45) DEFAULT NULL COMMENT '类型',
  `subject` varchar(45) DEFAULT NULL COMMENT '内容',
  `create_time` varchar(45) DEFAULT NULL COMMENT '创建时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='统计数据';

-- --------------------------------------------------------

--
-- 表的结构 `stock`
--

CREATE TABLE `stock` (
  `stock_id` int(11) NOT NULL COMMENT '库存编号',
  `total_count` varchar(45) DEFAULT NULL COMMENT '库存总数',
  `surplus` varchar(45) DEFAULT NULL COMMENT '剩余总数',
  `status` varchar(45) DEFAULT NULL COMMENT '状态',
  `office_supplies_id` int(11) NOT NULL COMMENT '办公物品编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='库存';

-- --------------------------------------------------------

--
-- 表的结构 `train_allocation`
--

CREATE TABLE `train_allocation` (
  `manager_id` int(11) NOT NULL COMMENT '负责人编号',
  `trainee_id` int(11) NOT NULL COMMENT '新成员编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='培训分配';

-- --------------------------------------------------------

--
-- 表的结构 `user`
--

CREATE TABLE `user` (
  `user_id` int(11) NOT NULL COMMENT '用户ID',
  `name` varchar(45) DEFAULT NULL COMMENT '用户名称',
  `telephone` varchar(45) DEFAULT NULL COMMENT '电话',
  `email` varchar(45) DEFAULT NULL COMMENT '邮箱',
  `dept_id` varchar(45) DEFAULT NULL COMMENT '部门编号',
  `is_manager` varchar(45) DEFAULT NULL COMMENT '是否为管理员'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 转存表中的数据 `user`
--

INSERT INTO `user` (`user_id`, `name`, `telephone`, `email`, `dept_id`, `is_manager`) VALUES
(1, '刘文哲', '18966939536', 'liuwenzhe@dormforce.net', NULL, 'true');

-- --------------------------------------------------------

--
-- 表的结构 `weekly_report`
--

CREATE TABLE `weekly_report` (
  `weekly_report_id` int(11) NOT NULL COMMENT '周报编号',
  `title` varchar(45) DEFAULT NULL COMMENT '标题',
  `subject` varchar(45) DEFAULT NULL COMMENT '内容',
  `create_time` varchar(45) DEFAULT NULL COMMENT '创建时间',
  `status` varchar(45) DEFAULT NULL COMMENT '状态',
  `trainee_id` int(11) NOT NULL COMMENT '新成员编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='周报';

-- --------------------------------------------------------

--
-- 表的结构 `weekly_work`
--

CREATE TABLE `weekly_work` (
  `weekly_work_id` int(11) NOT NULL COMMENT '每周任务编号',
  `type` varchar(45) DEFAULT NULL COMMENT '类型',
  `title` varchar(45) DEFAULT NULL COMMENT '标题',
  `subject` varchar(45) DEFAULT NULL COMMENT '内容',
  `create_time` varchar(45) DEFAULT NULL COMMENT '创建时间',
  `status` varchar(45) DEFAULT NULL COMMENT '状态',
  `score` varchar(45) DEFAULT NULL COMMENT '评价',
  `manager_id` int(11) NOT NULL COMMENT '负责人',
  `trainee_id` int(11) NOT NULL COMMENT '新成员'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='每周任务';

--
-- Indexes for dumped tables
--

--
-- Indexes for table `announcement`
--
ALTER TABLE `announcement`
  ADD PRIMARY KEY (`announcement_id`),
  ADD KEY `fk_announment_user1_idx` (`user_id`);

--
-- Indexes for table `email_template`
--
ALTER TABLE `email_template`
  ADD PRIMARY KEY (`email_template_id`);

--
-- Indexes for table `log`
--
ALTER TABLE `log`
  ADD PRIMARY KEY (`log_id`);

--
-- Indexes for table `meeting_minutes`
--
ALTER TABLE `meeting_minutes`
  ADD PRIMARY KEY (`meeting_minutes_id`),
  ADD KEY `fk_meeting_minutes_user1_idx` (`user_id`);

--
-- Indexes for table `office_supplies`
--
ALTER TABLE `office_supplies`
  ADD PRIMARY KEY (`office_supplies_id`);

--
-- Indexes for table `rental_record`
--
ALTER TABLE `rental_record`
  ADD PRIMARY KEY (`rental_record_id`),
  ADD KEY `fk_rental_record_user_idx` (`user_id`),
  ADD KEY `fk_rental_record_stock1_idx` (`stock_id`),
  ADD KEY `user_id` (`user_id`);

--
-- Indexes for table `repair`
--
ALTER TABLE `repair`
  ADD PRIMARY KEY (`repair_id`),
  ADD KEY `fk_repair_user1_idx` (`transactor`);

--
-- Indexes for table `settings`
--
ALTER TABLE `settings`
  ADD PRIMARY KEY (`settings_code`);

--
-- Indexes for table `statistic`
--
ALTER TABLE `statistic`
  ADD PRIMARY KEY (`statistic_id`);

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`stock_id`),
  ADD KEY `fk_stock_office_supplies1_idx` (`office_supplies_id`);

--
-- Indexes for table `train_allocation`
--
ALTER TABLE `train_allocation`
  ADD PRIMARY KEY (`manager_id`,`trainee_id`),
  ADD KEY `fk_train_allocation_user1_idx` (`manager_id`),
  ADD KEY `fk_train_allocation_user2_idx` (`trainee_id`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`user_id`);

--
-- Indexes for table `weekly_report`
--
ALTER TABLE `weekly_report`
  ADD PRIMARY KEY (`weekly_report_id`),
  ADD KEY `fk_weekly_report_train_allocation1_idx` (`trainee_id`);

--
-- Indexes for table `weekly_work`
--
ALTER TABLE `weekly_work`
  ADD PRIMARY KEY (`weekly_work_id`),
  ADD KEY `fk_weekly_work_train_allocation1_idx` (`manager_id`,`trainee_id`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `announcement`
--
ALTER TABLE `announcement`
  MODIFY `announcement_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '公告编号', AUTO_INCREMENT=3;
--
-- 使用表AUTO_INCREMENT `email_template`
--
ALTER TABLE `email_template`
  MODIFY `email_template_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '邮件模板编号';
--
-- 使用表AUTO_INCREMENT `log`
--
ALTER TABLE `log`
  MODIFY `log_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '日志编号';
--
-- 使用表AUTO_INCREMENT `meeting_minutes`
--
ALTER TABLE `meeting_minutes`
  MODIFY `meeting_minutes_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '会议纪要编号';
--
-- 使用表AUTO_INCREMENT `rental_record`
--
ALTER TABLE `rental_record`
  MODIFY `rental_record_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '租借记录号';
--
-- 使用表AUTO_INCREMENT `repair`
--
ALTER TABLE `repair`
  MODIFY `repair_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '报修编号';
--
-- 使用表AUTO_INCREMENT `statistic`
--
ALTER TABLE `statistic`
  MODIFY `statistic_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '统计编号';
--
-- 使用表AUTO_INCREMENT `weekly_report`
--
ALTER TABLE `weekly_report`
  MODIFY `weekly_report_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '周报编号';
--
-- 使用表AUTO_INCREMENT `weekly_work`
--
ALTER TABLE `weekly_work`
  MODIFY `weekly_work_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '每周任务编号';
--
-- 限制导出的表
--

--
-- 限制表 `announcement`
--
ALTER TABLE `announcement`
  ADD CONSTRAINT `fk_announment_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `meeting_minutes`
--
ALTER TABLE `meeting_minutes`
  ADD CONSTRAINT `fk_meeting_minutes_user1` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `rental_record`
--
ALTER TABLE `rental_record`
  ADD CONSTRAINT `fk_rental_record_stock1` FOREIGN KEY (`stock_id`) REFERENCES `stock` (`stock_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_rental_record_user` FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `repair`
--
ALTER TABLE `repair`
  ADD CONSTRAINT `fk_repair_user1` FOREIGN KEY (`transactor`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `stock`
--
ALTER TABLE `stock`
  ADD CONSTRAINT `fk_stock_office_supplies1` FOREIGN KEY (`office_supplies_id`) REFERENCES `office_supplies` (`office_supplies_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `train_allocation`
--
ALTER TABLE `train_allocation`
  ADD CONSTRAINT `fk_train_allocation_user1` FOREIGN KEY (`manager_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_train_allocation_user2` FOREIGN KEY (`trainee_id`) REFERENCES `user` (`user_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `weekly_report`
--
ALTER TABLE `weekly_report`
  ADD CONSTRAINT `fk_weekly_report_train_allocation1` FOREIGN KEY (`trainee_id`) REFERENCES `train_allocation` (`trainee_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- 限制表 `weekly_work`
--
ALTER TABLE `weekly_work`
  ADD CONSTRAINT `fk_weekly_work_train_allocation1` FOREIGN KEY (`manager_id`,`trainee_id`) REFERENCES `train_allocation` (`manager_id`, `trainee_id`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
