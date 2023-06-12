USE [OldCarShowroom]

--CAR BRAND
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

---CAR TYPE
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
-- 
--- ROLE
GO
INSERT [dbo].[tbl_role] ([roleid], [role_name]) VALUES (N'1', N'admin')
GO
INSERT [dbo].[tbl_role] ([roleid], [role_name]) VALUES (N'2', N'customer')
GO
INSERT [dbo].[tbl_role] ([roleid], [role_name]) VALUES (N'3', N'showroom''s owner')
GO
---USER
INSERT [dbo].[tbl_user] ([userid], [address], [avatar_url], [full_name], [password], [phone], [status], [user_name], [roleid]) VALUES (N'1', N'137 Lê Ð?i Hành', N'0', N'admin', N'123', N'0909090909', 1, N'admin', N'1')
GO
INSERT [dbo].[tbl_user] ([userid], [address], [avatar_url], [full_name], [password], [phone], [status], [user_name], [roleid]) VALUES (N'2', N'301 Lê Thánh Tôn', N'https://pbs.twimg.com/media/BtFUrp6CEAEmsml.jpg', N'Nguyen Dang Quang', N'123', N'0909090908', 1, N'quangnguyen', N'2')
GO
INSERT [dbo].[tbl_user] ([userid], [address], [avatar_url], [full_name], [password], [phone], [status], [user_name], [roleid]) VALUES (N'3', N'202 Tr?n Ð?i Du', N'https://cafefcdn.com/203337114487263232/2022/3/5/photo-4-16464479768131189701730.jpg', N'Nguyen Thai Hoan', N'123', N'0808080808', 1, N'thaihoan', N'3')
GO
INSERT [dbo].[tbl_user] ([userid], [address], [avatar_url], [full_name], [password], [phone], [status], [user_name], [roleid]) VALUES (N'4', N'77 Th?i An', N'https://pbs.twimg.com/media/BtFUrp6CEAEmsml.jpg', N'Nguyen Tran Nam Long', N'123', N'0797986546', 1, N'longnguyen', N'3')


-- ShowRoom
GO
INSERT [dbo].[tbl_showroom] ([showroomid], [showroom_address], [showroom_name], [showroom_phone], [userid]) VALUES (N'1', N'888 Tr?n Hung Ð?o', N'Showroom Thai Hoan', N'090546123', N'3')
GO
-- CAR
INSERT [dbo].[tbl_car] ([carid], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'1', N'Ðã s? d?ng', N'Chính hãng WesternFord bán xe qua s? d?ng Ford Ranger xls 4x2 MT, s?n xu?t nam 2017, di du?c 81000km, nh?p kh?u Thái Lan.Xe công ty d?ng tên xu?t hoá don.Xe dã du?c ki?m tra t?ng quát ch?t lu?ng r?t t?t.', N'Ranger XLS 4x2 MT', 81000, N'10', 449000000, 1, 2017, N'5', N'4', N'1', N'3')
GO

-- Execute bảng role trước rồi bảng tới bảng USER.
-- Execute Carbrand, Cartype, Showroom rồi tới bảng CAR
