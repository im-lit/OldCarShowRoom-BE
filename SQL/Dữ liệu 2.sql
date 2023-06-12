USE [OldCarShowroom]
GO
INSERT [dbo].[tbl_carbrand] ([car_brandid], [car_brand_name], [logo_url]) VALUES (N'1', N'Nissan', N'https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Nissan_logo.png/1196px-Nissan_logo.png')
GO
INSERT [dbo].[tbl_carbrand] ([car_brandid], [car_brand_name], [logo_url]) VALUES (N'2', N'BMW', N'https://cdn.freebiesupply.com/logos/large/2x/bmw-2-logo-png-transparent.png')
GO
INSERT [dbo].[tbl_carbrand] ([car_brandid], [car_brand_name], [logo_url]) VALUES (N'3', N'Mercedes-Benz', N'https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Mercedes-Logo.svg/2048px-Mercedes-Logo.svg.png')
GO
INSERT [dbo].[tbl_carbrand] ([car_brandid], [car_brand_name], [logo_url]) VALUES (N'4', N'Toyota', N'https://global.toyota/pages/global_toyota/mobility/toyota-brand/emblem_ogp_001.png')
GO
INSERT [dbo].[tbl_carbrand] ([car_brandid], [car_brand_name], [logo_url]) VALUES (N'5', N'Ford', N'https://global.toyota/pages/global_toyota/mobility/toyota-brand/emblem_ogp_001.png')
GO
INSERT [dbo].[tbl_carbrand] ([car_brandid], [car_brand_name], [logo_url]) VALUES (N'6', N'Vinfast', N'https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Logo_of_VinFast_%283D%29.svg/1986px-Logo_of_VinFast_%283D%29.svg.png')
GO
INSERT [dbo].[tbl_carbrand] ([car_brandid], [car_brand_name], [logo_url]) VALUES (N'7', N'Honda', N'https://w7.pngwing.com/pngs/26/42/png-transparent-honda-logo-car-honda-hr-v-honda-freed-honda.png')
GO
INSERT [dbo].[tbl_cartype] ([car_typeid], [car_type_name]) VALUES (N'1', N'SEDAN')
GO
INSERT [dbo].[tbl_cartype] ([car_typeid], [car_type_name]) VALUES (N'2', N'SUV')
GO
INSERT [dbo].[tbl_cartype] ([car_typeid], [car_type_name]) VALUES (N'3', N'Hatchback')
GO
INSERT [dbo].[tbl_cartype] ([car_typeid], [car_type_name]) VALUES (N'4', N'Pickup')
GO
INSERT [dbo].[tbl_cartype] ([car_typeid], [car_type_name]) VALUES (N'5', N'Truck')
GO
INSERT [dbo].[tbl_cartype] ([car_typeid], [car_type_name]) VALUES (N'6', N'MiniVan')
GO
INSERT [dbo].[tbl_cartype] ([car_typeid], [car_type_name]) VALUES (N'7', N'VF 5')
GO
INSERT [dbo].[tbl_role] ([roleid], [role_name]) VALUES (N'1', N'admin')
GO
INSERT [dbo].[tbl_role] ([roleid], [role_name]) VALUES (N'2', N'customer')
GO
INSERT [dbo].[tbl_role] ([roleid], [role_name]) VALUES (N'3', N'showroom''s owner')
GO
INSERT [dbo].[tbl_user] ([userid], [address], [avatar_url], [full_name], [password], [phone], [status], [user_name], [roleid]) VALUES (N'1', N'137 Lê Ðại Hành', N'0', N'admin', N'123', N'0909090909', 1, N'admin', N'1')
GO
INSERT [dbo].[tbl_user] ([userid], [address], [avatar_url], [full_name], [password], [phone], [status], [user_name], [roleid]) VALUES (N'2', N'301 Lê Thánh Tôn', N'https://pbs.twimg.com/media/BtFUrp6CEAEmsml.jpg', N'Nguyễn Đăng Quang', N'123', N'0909090908', 1, N'quangnguyen', N'2')
GO
INSERT [dbo].[tbl_user] ([userid], [address], [avatar_url], [full_name], [password], [phone], [status], [user_name], [roleid]) VALUES (N'3', N'202 Trần Đại Tôn', N'https://cafefcdn.com/203337114487263232/2022/3/5/photo-4-16464479768131189701730.jpg', N'Nguyễn Thái Hoàn', N'123', N'0808080808', 1, N'thaihoan', N'3')
GO
INSERT [dbo].[tbl_user] ([userid], [address], [avatar_url], [full_name], [password], [phone], [status], [user_name], [roleid]) VALUES (N'4', N'77 Thới An', N'https://pbs.twimg.com/media/BtFUrp6CEAEmsml.jpg', N'Nguyễn Trần Nam Long', N'123', N'0797986546', 1, N'longnguyen', N'3')
GO
INSERT [dbo].[tbl_showroom] ([showroomid], [showroom_address], [showroom_name], [showroom_phone], [userid]) VALUES (N'1', N'888 Trần Hưng Ðạo', N'Showroom Thai Hoan', N'090546123', N'3')
GO
INSERT [dbo].[tbl_showroom] ([showroomid], [showroom_address], [showroom_name], [showroom_phone], [userid]) VALUES (N'2', N'79 Pasteur', N'Nam Long Auto', N'05648655', N'4')
GO
INSERT [dbo].[tbl_car] ([carid], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'1', N'Ðã sử dụng', N'Chính hãng WesternFord bán xe qua sử dụng Ford Ranger xls 4x2 MT, sản xuất năm 2017, đi được 81000km, nhập khẩu Thái Lan.Xe công ty đứng tên xuất hoá đơn.Xe đã được kiểm tra tổng quát chất lượng rất tốt.', N'Ranger XLS 4x2 MT', 81000, N'10', 449000000, 1, 2017, N'5', N'4', N'1', N'3')
GO
INSERT [dbo].[tbl_car] ([carid], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'2', N'Mới', N'NamLong AUTO,79 Pasteur, Quận 1, Tp.HCM', N'VINFAST VF 5', 11000, N'10', 428000000, 1, 2023, N'6', N'7', N'2', N'4')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'1', N'https://cdn.chotot.com/7kH5SuKn8BU7mS8zCrhmBj4t-nKfIYOYYMSM-t1R0T8/preset:view/plain/a8d73a34a064d023da9d39265d63ea6c-2828957521130015872.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'10', N'https://cdn.chotot.com/NgDTsaxLS82aEaUKHfKD6DRcenvoJDbkp5SkVj0L2eQ/preset:view/plain/d3e104c2e466ab221fb857bc48131ad8-2824948392310315506.jpg', N'2')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'2', N'https://cdn.chotot.com/lVOoa-qmwyxFCe9ASyaY5zkya_G--bsRi1XU6uc9q8g/preset:view/plain/3125a2bc64fd5d19cff499f7445203c1-2828957521012368869.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'3', N'https://cdn.chotot.com/fE5TATmiIwajpo76L2PdXrN1dYnUbrKr9biVIhmScuw/preset:view/plain/42a414261f2a0048fbb46c3cb300d200-2828957523375749373.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'4', N'https://cdn.chotot.com/9RIgMhIuz6lw5t8yeOV-FIXudoRod0Z7cdmesoNEzaY/preset:view/plain/2529f3cb6f6f220127fcd5de61b00c91-2828957523697060992.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'5', N'https://cdn.chotot.com/rSevD2swSYBvIMZgCjAO7WDYy-RTGvVnI7TqS9gcPGA/preset:view/plain/81b9b6ac52eb8555bb50ad6872c83650-2828957525520059414.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'6', N'https://cdn.chotot.com/BK_tO0ZVPnQxY-ID80BVg9oDqFzSWxZaKWpuNPEQ6_I/preset:view/plain/54b9672c958bee8879ece5d9ac641035-2828957525659788773.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'7', N'https://cdn.chotot.com/KReVEPU0pKGIokFmaaK4ETB_qPoG520LImO1DJyNDFo/preset:view/plain/89fcbad29e1275e98e04af8ac54c68d4-2828957527505620096.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'8', N'https://cdn.chotot.com/5Jcmb3QlphopA9vwBv4mkF7HNJ7RXWSVfK-jd44pFVk/preset:view/plain/daf49fd89da9be149e499947a47c383a-2824948392125029666.jpg', N'2')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'9', N'https://cdn.chotot.com/AEHRQlm5STZHcbcnZXQEBo9a5v1wpRuETF96ghMj510/preset:view/plain/7ea3f9db228971863eadb63e6d86f211-2824948392306875476.jpg', N'2')
GO
