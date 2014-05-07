---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------
insert into community values
(
   null,
   'Java Community',
   curdate(),
   'Its a virtual abode of all the nerds who eat, drink and sleep java',
   'House Number - 1678, Housing Board Colony, Sector - 31, Gurgaon',
   'javacommunity@anucana.com',
   'www.anucana.com/javacommunity',
   9650733522,
   'ptc_m',
   'itc_4',
   'tcs_act',
   1,
   curdate(),
   1,
   curdate()
)
;

-- Setup some seed keywords
insert into community_keywords values
(
   null,
   (select community_id from community where name='Java Community'),
   'Java Community',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Java Community'),
   'Java',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Java Community'),
   'Gurgaon',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Java Community'),
   'J2EE',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Java Community'),
   'Object Oriented Programming',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Java Community'),
   'Threads',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Java Community'),
   'JSwing',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Java Community'),
   'Design Patterns',
   1,
   curdate()
)
;

-- Subscribe the user arv.sri.ggn@gmail.com to java community
insert into user_community values
(
   null,
   (select login_id from user_login where user_name = 'arv.sri.ggn@gmail.com'),
   (select community_id from community where name='Java Community'),
   1,
   curdate()
)
;


---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------
insert into community values
(
   null,
   'User Interface Design',
   curdate(),
   'Community of developers who can design and develop cool user interfaces. They are awesome at what they do.',
   'House Number - 528, Sector - 15 Part 1, Gurgaon',
   'user_interface_design@anucana.com',
   'www.anucana.com/uidesign',
   9650733522,
   'ptc_m',
   'itc_4',
   'tcs_act',
   1,
   curdate(),
   1,
   curdate()
)
;

insert into community_keywords values
(
   null,
   (select community_id from community where name='User Interface Design'),
   'Struts',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='User Interface Design'),
   'Spring MVC',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='User Interface Design'),
   'JQuery',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='User Interface Design'),
   'Adobe Flash',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='User Interface Design'),
   'HTML',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='User Interface Design'),
   'CSS',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='User Interface Design'),
   'Dreamweaver',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='User Interface Design'),
   'GWT',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='User Interface Design'),
   'Paint',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='User Interface Design'),
   'Draw',
   1,
   curdate()
)
;


---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------

insert into community values
(
   null,
   'Mobile Application Development',
   curdate(),
   'Mobile applicationd developers community. We develop amazing apps for android, iphone, blackberry and windows',
   'House Number - 776 Sector 9, Gurgaon',
   'mobile_app_dev@anucana.com',
   'www.anucana.com/mobiappdev',
   9650733522,
   'ptc_m',
   'itc_4',
   'tcs_act',
   1,
   curdate(),
   1,
   curdate()
)
;

insert into community_keywords values
(
   null,
   (select community_id from community where name='Mobile Application Development'),
   'Android',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mobile Application Development'),
   'Iphone',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mobile Application Development'),
   'Objective C',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mobile Application Development'),
   'Java',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mobile Application Development'),
   'Nokia Lumia',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mobile Application Development'),
   'Black berry',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mobile Application Development'),
   'Wireless Access Protocol',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mobile Application Development'),
   'Google',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mobile Application Development'),
   'Symbian',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mobile Application Development'),
   'handset',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mobile Application Development'),
   'google map',
   1,
   curdate()
)
;

---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------
insert into community values
(
   null,
   'Leadership Community',
   curdate(),
   'Community of leaders of life and those who aspire to be',
   'House Number - 528, Sector - 15 Part 1, Gurgaon',
   'user_interface_design@anucana.com',
   'www.anucana.com/uidesign',
   9650733522,
   'ptc_m',
   'itc_4',
   'tcs_act',
   1,
   curdate(),
   1,
   curdate()
)
;

insert into community_keywords values
(
   null,
   (select community_id from community where name='Leadership Community'),
   'Leader',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Leadership Community'),
   'High Achiever',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Leadership Community'),
   'Growth Plan',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Leadership Community'),
   'Career Plan',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Leadership Community'),
   'Motivation',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Leadership Community'),
   'Work ethics',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Leadership Community'),
   'Innovation',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Leadership Community'),
   'Management',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Leadership Community'),
   'Leader',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Leadership Community'),
   'Sales and marketing',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Leadership Community'),
   'Employees',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Leadership Community'),
   'Vishakha Guidlines',
   1,
   curdate()
)
;

---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------
insert into community values
(
   null,
   'Mainframe Community',
   curdate(),
   
   'Modern mainframe design is generally less defined by single-task computational speed (typically defined as MIPS rate or FLOPS in the case of floating point calculations), and more by:\n1.Redundant internal engineering resulting in high reliability and security \n2.Extensive input-output facilities with the ability to offload to separate engines \n3.Strict backward compatibility with older software \n4.High hardware and computational utilization rates through virtualization to support massive throughput \n\n Their high stability and reliability enables these machines to run uninterrupted for decades. \n\nSoftware upgrades usually require setting up the operating system or portions thereof, and are non-disruptive only when using virtualizing facilities such as IBM′s z/OS and Parallel Sysplex, or Unisys XPCL, which support workload sharing so that one system can take over another\'s application while it is being refreshed. Mainframes are defined by high availability, one of the main reasons for their longevity, since they are typically used in applications where downtime would be costly or catastrophic. The term reliability, availability and serviceability (RAS) is a defining characteristic of mainframe computers. Proper planning and implementation is required to exploit these features, and if improperly implemented, may serve to inhibit the benefits provided. In addition, mainframes are more secure than other computer types: the NIST vulnerabilities database, US-CERT, rates traditional mainframes such as IBM zSeries, Unisys Dorado and Unisys Libra as among the most secure with vulnerabilities in the low single digits as compared with thousands for Windows, Unix, and Linux.\n\n In the late 1950s, most mainframes had no explicitly interactive interface. They accepted sets of punched cards, paper tape, or magnetic tape to transfer data and programs. They operated in batch mode to support back office functions, such as customer billing, and supported interactive terminals almost exclusively for applications rather than program development. Typewriter and Teletype devices were also common control consoles for system operators through the 1970s, although ultimately supplanted by keyboard/display devices. By the early 1970s, many mainframes acquired interactive user interfaces and operated as timesharing computers, supporting hundreds of users simultaneously along with batch processing. Users gained access through specialized terminals or, later, from personal computers equipped with terminal emulation software. By the 1980s, many mainframes supported graphical terminals, and terminal emulation, but not graphical user interfaces. This format of end-user computing reached mainstream obsolescence in the 1990s due to the advent of personal computers provided with GUIs. After 2000, most modern mainframes have partially or entirely phased out classic \"green screen\" terminal access for end-users in favour of Web-style user interfaces. \nThe infrastructure requirements were drastically reduced during the mid-1990s when CMOS mainframe designs replaced the older bipolar technology. IBM claimed that its newer mainframes could reduce data center energy costs for power and cooling, and that they could reduce physical space requirements compared to server farms.',
   'House Number - 1234, Sector - 15 Part 1, Gurgaon',
   'mainframe_community@anucana.com',
   'www.anucana.com/mainframe',
   9650733522,
   'ptc_m',
   'itc_4',
   'tcs_act',
   1,
   curdate(),
   1,
   curdate()
)
;

insert into community_keywords values
(
   null,
   (select community_id from community where name='Mainframe Community'),
   'MIPS',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mainframe Community'),
   'IBM\'s z/OS',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mainframe Community'),
   'punched cards',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mainframe Community'),
   'reliability, availability and serviceability',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mainframe Community'),
   'FLOPS',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mainframe Community'),
   'Unisys Dorado',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mainframe Community'),
   'Cobol',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mainframe Community'),
   'JCL',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mainframe Community'),
   'CICS',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Mainframe Community'),
   'DB2',
   1,
   curdate()
)
;

---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------
---------------------------------------------------------------------------------------------------------------------------
insert into community values
(
   null,
   'Photography Club',
   curdate(),
   'In Short \n\n\n A platform for beginners & photography enthusiasts. Bought a camera recently or have finally decided to learn photography? You are at the right place. DPC organises beginner photography workshops, photowalks, outdoor trips, exhibitions to help you express your creative side. \n\n Makes sense? \n\n What DPC is not: A platform to outdo each other. We aren’t in the business of identifying the best amongst the rest. If that is what you are looking for, you are on the wrong page \n\n What Are We Upto \n\n We are constantly trying to take away all the possible reasons for you to not take up photography. So if you need more incentive to shoot, there are group activities like Heritage Photowalks where you can participate. If you just bought a camera, you can join our beginner’s course. If you can’t travel, there are mentors of the club who can help you remotely. DPC also gives you the opportunity to showcase your work in its exhibitions as a platform to finally show the world what you can do! \n\n We will keep you busy Creating something, New! Surprising! Valuable!',
   'blah blah blah, gurgaon',
   'photography_club@anucana.com',
   'www.anucana.com/photographyClub',
   123456789,
   'ptc_m',
   'itc_4',
   'tcs_act',
   1,
   curdate(),
   1,
   curdate()
)
;

insert into community_keywords values
(
   null,
   (select community_id from community where name='Photography Club'),
   'lens',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Photography Club'),
   'camera',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Photography Club'),
   'adventure',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Photography Club'),
   'photography',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Photography Club'),
   'photo shoot',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Photography Club'),
   'Photography Club',
   1,
   curdate()
)
;
insert into community_keywords values
(
   null,
   (select community_id from community where name='Photography Club'),
   'pictures',
   1,
   curdate()
)
;
