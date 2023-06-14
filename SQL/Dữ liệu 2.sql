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
INSERT [dbo].[tbl_carbrand] ([car_brandid], [car_brand_name], [logo_url]) VALUES (N'8', N'LandRover', N'https://upload.wikimedia.org/wikipedia/en/thumb/4/4a/LandRover.svg/1200px-LandRover.svg.png')
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
INSERT [dbo].[tbl_cartype] ([car_typeid], [car_type_name]) VALUES (N'8', N'C Class')
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
INSERT [dbo].[tbl_car] ([carid], [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'1', N'https://cdn.chotot.com/7kH5SuKn8BU7mS8zCrhmBj4t-nKfIYOYYMSM-t1R0T8/preset:view/plain/a8d73a34a064d023da9d39265d63ea6c-2828957521130015872.jpg', N'Ðã sử dụng', N'Chính hãng WesternFord bán xe qua sử dụng Ford Ranger xls 4x2 MT, sản xuất năm 2017, đi được 81000km, nhập khẩu Thái Lan.Xe công ty đứng tên xuất hoá đơn.Xe đã được kiểm tra tổng quát chất lượng rất tốt.', N'Ranger XLS 4x2 MT', 81000, N'America', 449000000, N'CAN_SALE', 2017, N'5', N'4', N'1', N'3')
GO
INSERT [dbo].[tbl_car] ([carid], [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'10', N'https://cdn.chotot.com/x7XLFYVI8frvSuo6cs6mwNMxQ9BK9NyKBikE5LgV8UY/preset:view/plain/b2c30288ee8764845c9835cd47f25346-2829835520097404255.jpg', N'Đã sử dụng', N'Civic G Trắng 2022, ODO 28k km, keng như cây kiếm,giá chỉ 7xx.000.000 ( giá cực êm cho QKH thiện chí )
', N'Honda Civic G tr?ng giá t?t còn thuong lu?ng', 28000, N'Thai Lan', 735000000, N'CAN_SALE', 2022, N'7', N'1', N'1', N'2')
GO
INSERT [dbo].[tbl_car] ([carid], [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'2', N'https://cdn.chotot.com/5Jcmb3QlphopA9vwBv4mkF7HNJ7RXWSVfK-jd44pFVk/preset:view/plain/daf49fd89da9be149e499947a47c383a-2824948392125029666.jpg', N'Mới', N'NamLong AUTO,79 Pasteur, Quận 1, Tp.HCM', N'VINFAST VF 5', 11000, N'VietNam', 428000000, N'CAN_SALE', 2023, N'6', N'7', N'2', N'4')
GO
INSERT [dbo].[tbl_car] ([carid], [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'3', N'https://cdn.chotot.com/NyGjnbV0ZiGfB2DS7gqs3sv51ZYeAm-_hwbpvu7qCbE/preset:view/plain/731070572a7baa195b2b849f550800c6-2828706568282839309.jpg', N'Đã sử dụng', N'Ngoại thất màu Đen, nội thất Kem siêu chảnh,Có rất nhiều công nghệ hiện đại: đèn Multibeam, loa Burmester, nước hoa Air-balance, màn che nắng kính sau chỉnh điện, sạc không dây, cốp điện, nhiều chế độ lái với Dynamic select,...', N'Mercedes C200 Exclusive 2020 ', 47000, N'VietNam', 1199000000, N'CAN_SALE', 2020, N'3', N'8', N'2', N'4')
GO
INSERT [dbo].[tbl_car] ([carid], [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'4', N'https://cdn.chotot.com/vsw-e2Rp88e7XdH3g9CCgHn0FWMmKeXcWLleXuSDo94/preset:view/plain/d76b2bf098b07e2fddc9cc46dcb726b3-2828740852989251664.jpg', N'Đã  sử dụng', N' Xe màu đen, nội thất đen. Xe trang bị hub kính, Loa Bum, Cửa nóc, rèm điện, calangAMG, Mâm 5 chất AMG, nước hoa', N'C300 AMG Sx 2016 Ðen Ðen full', 79000, N'VietNam', 988000000, N'CAN_SALE', 2016, N'3', N'8', N'2', N'4')
GO
INSERT [dbo].[tbl_car] ([carid], [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'5', N'https://cdn.chotot.com/C4yFCv0ni_wAJmfqzUU-N1SbkriGwzncxQpSIufGuAg/preset:view/plain/eab9c6cad0854b17ff68c7ac0037ace9-2822889962593694567.jpg', N'Đã sử dụng', N'MERCEDES BENZ C200 AVANGARDE MODEL 2023 - MỘT CHỦ TỪ ĐẦU,XE LƯỚT CHẤT LƯỢNG ✔ GIÁ TỐT', N'MERCEDES BENZ C200 AVANGARDE MODEL 2023', 7000, N'Germany', 1529000000, N'CAN_SALE', 2023, N'3', N'8', N'2', N'4')
GO
INSERT [dbo].[tbl_car] ([carid], [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'6', N'https://cdn.chotot.com/JijNyl_j9m8gB3JkqD0NQl6PTxFA4o2wexIGRIqAEJU/preset:view/plain/8b84e60ba2b10eeb5bc5da504e385ade-2827870198192250460.jpg', N'Đã sử dụng', N'Mercedes C250 2016 - Sang Xịn Mịn,Động cơ 2.0L, 211hp, Tối ưu nhiên liệu.Model Classic logo đứng sang trọng. Ốp gỗ Nâu bóng Walnut cao cấp.13 Loa Burmester 590 watt siêu đỉnh. Air Balance Máy nước hoa + Lọc không khí bụi mịn.', N'MERCEDES C250 2016 - SANG X?N SIÊU Ð?P', 170000, N'Germany', 679000000, N'CAN_SALE', 2016, N'3', N'8', N'2', N'4')
GO
INSERT [dbo].[tbl_car] ([carid], [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'7', N'https://cdn.chotot.com/me-AId4VXsGXrUeaEIxci7yGRpDJF43Y8ttc9sVdECs/preset:view/plain/b3b2a3c79f1039a2e916cce53d57b632-2828576827288131010.jpg', N'Đã sử dụng', N'TOYOTA LANDCRUISER PRADO TXL
Một chiếc *** - Up full 2020 : 300 triệu.
Xe Vũng Tàu, biển VIP 72A-123.23 ( ae được giữ biển nhé )
Sản xuất: 2014 - Odo zin: 65.000 Mile ( cực ít so với mấy bé cùng đời )
Đã lên Form 2020', N'Toyota LandCruiser Prado Up 2020 full d? 300trieu', 65000, N'VietNam', 1190000000, N'CAN_SALE', 2014, N'4', N'2', N'1', N'2')
GO
INSERT [dbo].[tbl_car] ([carid], [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'8', N'https://cdn.chotot.com/mbQRc-xqgkO6jVDo0cH1Te2PNAlUeAYod1KRe0_Aptk/preset:view/plain/315823dec2265704cda4c40cc3c1d9ce-2821583033624457739.jpg', N'Đã sử dụng', N'LandRover Range Rover Autobigraphy SDV8', N' Range Rover Autobiography 4.4 Diesel cao c?p 2014', 56237, N'Anh', 2699000000, N'CAN_SALE', 2014, N'8', N'2', N'1', N'2')
GO
INSERT [dbo].[tbl_car] ([carid], [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES (N'9', N'https://cdn.chotot.com/LfILHMiLD6U5n2v0WsvuXTEtZu75V54m1jCuKTgnoxw/preset:view/plain/125e2b275e5f137120224b6d03a71306-2810415017537253593.jpg', N'Mới', N'HONDA CRV 2023 KM KHỦNG 150%. Đẹp cực khủng', N'HONDA CRV 2023 KM KH?NG 150% TRU?C B? - GIÁ T?T', 200, N'Japan', 1118000000, N'CAN_SALE', 2023, N'7', N'2', N'1', N'2')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'1', N'https://cdn.chotot.com/7kH5SuKn8BU7mS8zCrhmBj4t-nKfIYOYYMSM-t1R0T8/preset:view/plain/a8d73a34a064d023da9d39265d63ea6c-2828957521130015872.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'10', N'https://cdn.chotot.com/NgDTsaxLS82aEaUKHfKD6DRcenvoJDbkp5SkVj0L2eQ/preset:view/plain/d3e104c2e466ab221fb857bc48131ad8-2824948392310315506.jpg', N'2')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'11', N'https://cdn.chotot.com/NyGjnbV0ZiGfB2DS7gqs3sv51ZYeAm-_hwbpvu7qCbE/preset:view/plain/731070572a7baa195b2b849f550800c6-2828706568282839309.jpg', N'3')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'12', N'https://cdn.chotot.com/8sE_yll6_SHDJEihe-d2byyat8YtBViVftLLdudnvQc/preset:view/plain/fae0c37b4b4ee14f3bb1b292d9673148-2828706567202695301.jpg', N'3')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'13', N'https://cdn.chotot.com/0tOAn7cm-29OmGwODLbQJhuFpynNnYWgU0ecEYIn_X8/preset:view/plain/179317a00dd05514a009be586974898b-2828706567571334999.jpg', N'3')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'14', N'https://cdn.chotot.com/LuqnjaPsYBVQNdpKBPpoaS3JcY1kf_O6052RfG278xo/preset:view/plain/806285860718f349193b078aa2af918e-2828706567524746387.jpg', N'3')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'15', N'https://cdn.chotot.com/d9iR4gJLJ84RVxdlKglBvX5PzI2ZImLJEHt3fZKkq1c/preset:view/plain/1229303f75721310121190e4c5d18a43-2828706567559203721.jpg', N'3')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'16', N'https://cdn.chotot.com/vsw-e2Rp88e7XdH3g9CCgHn0FWMmKeXcWLleXuSDo94/preset:view/plain/d76b2bf098b07e2fddc9cc46dcb726b3-2828740852989251664.jpg', N'4')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'17', N'https://cdn.chotot.com/E_CQKZt-OFuNLpcuU1ozXPtLbA-RHlH7ubim-Q9tuuw/preset:view/plain/30d321de5776ad84dbe97b9f760d15ba-2828740852423019401.jpg', N'4')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'18', N'https://cdn.chotot.com/gx84NiFCJfoAP18ZiFWU_uXoqWkIiFI1atpU_KHLjrQ/preset:view/plain/11fd9a7018b28429a2c46ab79854bae2-2828740851879196215.jpg', N'4')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'19', N'https://cdn.chotot.com/2PkGPG7KcVhJC3Nck_TKHiDeeMgb9hfzLiPiAv3808A/preset:view/plain/0f9a2248bf3dec816e6c8fb444bd00c2-2828740849547097655.jpg', N'4')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'2', N'https://cdn.chotot.com/lVOoa-qmwyxFCe9ASyaY5zkya_G--bsRi1XU6uc9q8g/preset:view/plain/3125a2bc64fd5d19cff499f7445203c1-2828957521012368869.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'20', N'https://cdn.chotot.com/Oi-vhj92qPnJph7XuK-hPb_gG7Wuekcw6SHWuOBFlsc/preset:view/plain/2785198c278aea05b5bad036e4d48d0d-2828740852974249815.jpg', N'4')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'21', N'https://cdn.chotot.com/6ZOOMbic_cWigMnjDJ12mdmh8onTSRzWCapRxr0VhQQ/preset:view/plain/692dc2835739814c66846e76bfd310a4-2828740852347949756.jpg', N'4')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'22', N'https://cdn.chotot.com/C4yFCv0ni_wAJmfqzUU-N1SbkriGwzncxQpSIufGuAg/preset:view/plain/eab9c6cad0854b17ff68c7ac0037ace9-2822889962593694567.jpg', N'5')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'23', N'https://cdn.chotot.com/LIIL5fhVG_mgudpxyw7aKn4ISXKxaOlllFmeEWhz5Bs/preset:view/plain/c6a02db0fee36e224fe0ea4d20f9e9e3-2822889965041232326.jpg', N'5')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'24', N'https://cdn.chotot.com/80rXwMkHbFmrS81E9byeHU67yuJz3nHHc-ruvCHNQsg/preset:view/plain/4a816c868899a384efddd9515411cd85-2822889963552620114.jpg', N'5')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'25', N'https://cdn.chotot.com/UAhQog9SxYXRcTNL_q32b2sPpfzPBLqCrrl9hwiRMO4/preset:view/plain/03b84360c37de69718359ce942e03acd-2822889962205817286.jpg', N'5')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'26', N'https://cdn.chotot.com/OaLFrqJl0i5HIBYGJa9L4caXuGvbFmGET2NVhtTNBjo/preset:view/plain/d993c07e0f08c0829712402630276266-2822889966211648379.jpg', N'5')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'27', N'https://cdn.chotot.com/TB1v7xu1DjUK5niC-GXYfSiK4mcIDUpSTJ9Wrag4G1s/preset:view/plain/6cff74bb9c02eb78be8936fd60994dc7-2822889966575698392.jpg', N'5')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'28', N'https://cdn.chotot.com/nsOjvXnnG9it_BmfgVAW7htUB1E-01560OnJZsOZIDI/preset:view/plain/9a5bd92c18e40ea1a5f911f669f5653a-2822889965475109707.jpg', N'5')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'29', N'https://cdn.chotot.com/me-AId4VXsGXrUeaEIxci7yGRpDJF43Y8ttc9sVdECs/preset:view/plain/b3b2a3c79f1039a2e916cce53d57b632-2828576827288131010.jpg', N'7')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'3', N'https://cdn.chotot.com/fE5TATmiIwajpo76L2PdXrN1dYnUbrKr9biVIhmScuw/preset:view/plain/42a414261f2a0048fbb46c3cb300d200-2828957523375749373.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'30', N'https://cdn.chotot.com/wN5RAk4FaKl9OddMKNRHibXlY7aNqXFiaeue88Sg4NE/preset:view/plain/7671b286b5b1336e5b92b3d7184b70bb-2828576827663877945.jpg', N'7')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'31', N'https://cdn.chotot.com/ZkpbHKllWe4GprWO-QI410w2crGTw7PZHrq_J4W7nas/preset:view/plain/ba6e828a79d9be62de465d2ca61c2933-2828576828923290335.jpg', N'7')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'32', N'https://cdn.chotot.com/12_E0ZeBUJCoVp_miUUo_lZx7ld1VzpcYedWEwceUDg/preset:view/plain/3bf0ba692d75b4a7e04d643dd644709d-2828576827797413715.jpg', N'7')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'33', N'https://cdn.chotot.com/iKVfqpnAwwp0M58mb32J3xwf06VUX-HKBZshlNDmGHk/preset:view/plain/2264979574c0fa8cd50711cb32054186-2828576827733840905.jpg', N'7')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'34', N'https://cdn.chotot.com/bcvGcss2uyx9UxH8rMpsuKzFQ9saQR69NH6uPvw_sUs/preset:view/plain/762f88d4c2c1753b7782d8135aa7ffbc-2828576828295849570.jpg', N'7')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'35', N'https://cdn.chotot.com/RNZOxcXMUMcmfbn1eVCwiOvu6p3SKd7GSK070CrTGQo/preset:view/plain/22ab5017a0324c9f98c1c7077833414e-2828576828793088499.jpg', N'7')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'36', N'https://cdn.chotot.com/mbQRc-xqgkO6jVDo0cH1Te2PNAlUeAYod1KRe0_Aptk/preset:view/plain/315823dec2265704cda4c40cc3c1d9ce-2821583033624457739.jpg', N'8')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'37', N'https://cdn.chotot.com/FMW8PGN7Gi_UpdOkGdbzTzxGEFCBs2NEVjH6eTpCSvc/preset:view/plain/577d731b514b8210b7ac54b5b83c326a-2821583033875859612.jpg', N'8')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'38', N'https://cdn.chotot.com/aeWsxAiwfegQ0neefPJiVZXAYR9Q7VPMhz983rrc4AM/preset:view/plain/61b9707d6a59af283fd7d71c50397eb8-2821583032872458061.jpg', N'8')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'39', N'https://cdn.chotot.com/TF6e4EKxUJX-95ks7veNzOIaOANIM1j2UetA7nL8QLI/preset:view/plain/5b9613d15b01b35a0a28870636c0b4b2-2821583033338580296.jpg', N'8')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'4', N'https://cdn.chotot.com/9RIgMhIuz6lw5t8yeOV-FIXudoRod0Z7cdmesoNEzaY/preset:view/plain/2529f3cb6f6f220127fcd5de61b00c91-2828957523697060992.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'40', N'https://cdn.chotot.com/UaNfuGENDz23sPX7Uhc52JkohCzHDeuU2nofiI7a_oY/preset:view/plain/c57852703103c8cfc0f653d224e07147-2821583033780172084.jpg', N'8')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'41', N'https://cdn.chotot.com/3_vbVBjZkORbOe53rcHbm2Gw7iqi2iaWjK5il38FMes/preset:view/plain/e2abf7f62e393decef82e1e1bbd71599-2821583033455310021.jpg', N'8')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'42', N'https://cdn.chotot.com/LfILHMiLD6U5n2v0WsvuXTEtZu75V54m1jCuKTgnoxw/preset:view/plain/125e2b275e5f137120224b6d03a71306-2810415017537253593.jpg', N'9')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'43', N'https://cdn.chotot.com/czEbK94qk1oiE7kgjR80vMgAZcpTLlMGknJppXcwnfo/preset:view/plain/bec77dfd46b8683d6721a11fba641cc5-2810415036537494443.jpg', N'9')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'44', N'https://cdn.chotot.com/td0nsBNb0Jlt9obd8bzikKF8xvqWekbLAEJYFVVORPA/preset:view/plain/ad90e84fc56935fc83f5e5c677f6b12d-2810415036704278352.jpg', N'9')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'45', N'https://cdn.chotot.com/vEa57YAHLPSEusDtQhlaCxm05-n6oKSzVpDCVkZ-Y-Y/preset:view/plain/8b5f964a5ae95d347b94abacde943f65-2810415036680127673.jpg', N'9')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'46', N'https://cdn.chotot.com/uxH3XVhIQo4UjBKekJ1uOlzSoXZmp2OeGVDLdFIj5BM/preset:view/plain/f26b8496ad70d40ce18f8987e9759807-2810415037168582909.jpg', N'9')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'47', N'https://cdn.chotot.com/7v6YLNwBo8p2rw_JH_wHjt7sV-L6E0JMxNJ8L1BRK1Y/preset:view/plain/75e57107588ba0d5b043fd52ac5814d8-2810415036517362311.jpg', N'9')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'48', N'https://cdn.chotot.com/jGijVO1r24CyfFNBpzqOVWoN49eeGUyV9xCM7Ztm72o/preset:view/plain/4f77d0cea72988ec72823f4b2fb3c000-2810415036867702920.jpg', N'9')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'49', N'https://cdn.chotot.com/x7XLFYVI8frvSuo6cs6mwNMxQ9BK9NyKBikE5LgV8UY/preset:view/plain/b2c30288ee8764845c9835cd47f25346-2829835520097404255.jpg', N'10')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'5', N'https://cdn.chotot.com/rSevD2swSYBvIMZgCjAO7WDYy-RTGvVnI7TqS9gcPGA/preset:view/plain/81b9b6ac52eb8555bb50ad6872c83650-2828957525520059414.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'50', N'https://cdn.chotot.com/u1GcMeshQqqEiNqYWlVtCNeJZ7XySYrmgsLlxSeZUxI/preset:view/plain/abe74fa2ceb0af702be4434a2a8c9c2f-2829835520240535157.jpg', N'10')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'51', N'https://cdn.chotot.com/upRRXEIxP5zwtoUt_HJOqCkXTy9Raghd4d5q3pD6H2w/preset:view/plain/73fc097c8b31e90cd97ba1ecf00f8fc9-2829835520307719062.jpg', N'10')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'52', N'https://cdn.chotot.com/5FUDSOhZ-42gd9w8OjHf_AdxsNqEDH_aH_G-Bv6SY68/preset:view/plain/07632a3380a0a03928ec3bf08dcc7500-2829835520171858014.jpg', N'10')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'53', N'https://cdn.chotot.com/2wP-BfwwaYB43am2ne99GiR0Rv15C391lhia7OLsbPc/preset:view/plain/35e4f68b79aa09a0fa2663567451f387-2829835520232659356.jpg', N'10')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'54', N'https://cdn.chotot.com/JS2YBa0_AbCWVBkqTeu3qWrv3Vaug3Iao8iQWzlznQ4/preset:view/plain/5f15c11a820b69f59b1328fda333e93a-2829835520070392224.jpg', N'10')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'55', N'https://cdn.chotot.com/JijNyl_j9m8gB3JkqD0NQl6PTxFA4o2wexIGRIqAEJU/preset:view/plain/8b84e60ba2b10eeb5bc5da504e385ade-2827870198192250460.jpg', N'6')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'56', N'https://cdn.chotot.com/eAzjedYWyoIeO55LzCWIdwUg-KEcPa3chnKtajZlrtE/preset:view/plain/6984de8023ab8e2f7ab3653fbe669bfc-2827870198513986114.jpg', N'6')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'57', N'https://cdn.chotot.com/FWzuuNqjDUemDiSNoJXUSuqeAvqjL4v1ZvB0b7P8gAg/preset:view/plain/e5da7f2bed09f486ff52ef3b42a6d19b-2827870198494944107.jpg', N'6')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'58', N'https://cdn.chotot.com/DZ88O3i2Dj_CscbE7yScRQSQ5YvYdcredDgay-51LBs/preset:view/plain/fe31bcf3ddb35496ca32c4fba3788022-2827870198522233484.jpg', N'6')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'59', N'https://cdn.chotot.com/EWF8DvJhaZMV_cPYIgKGSBaRyURrJIBQ3JtHZm11fag/preset:view/plain/587c0c54203ae9261fddf6c6f4e452bc-2827870198465799063.jpg', N'6')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'6', N'https://cdn.chotot.com/BK_tO0ZVPnQxY-ID80BVg9oDqFzSWxZaKWpuNPEQ6_I/preset:view/plain/54b9672c958bee8879ece5d9ac641035-2828957525659788773.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'60', N'https://cdn.chotot.com/chUAMypaJnzg8ktd9HHFdaF4f2syQr2u4F5kgAipw9g/preset:view/plain/04a23d3f199fe1289c6b6a86f5b74c1a-2827870198622027301.jpg', N'6')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'61', N'https://cdn.chotot.com/wtkd0T-A-5pikn_oczUIHhi7zFBPNaHgbaK0v6KikYk/preset:view/plain/8acf8b18e2f5da622e413be411755354-2827870198506411642.jpg', N'6')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'62', N'https://cdn.chotot.com/PxrPf0go51DXGfjlO9Amj3XwgYwXjid0RBTof7TegoE/preset:view/plain/0db61e2d5f44725f53e61f42aa4eb35f-2827870198509948054.jpg', N'6')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'7', N'https://cdn.chotot.com/KReVEPU0pKGIokFmaaK4ETB_qPoG520LImO1DJyNDFo/preset:view/plain/89fcbad29e1275e98e04af8ac54c68d4-2828957527505620096.jpg', N'1')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'8', N'https://cdn.chotot.com/5Jcmb3QlphopA9vwBv4mkF7HNJ7RXWSVfK-jd44pFVk/preset:view/plain/daf49fd89da9be149e499947a47c383a-2824948392125029666.jpg', N'2')
GO
INSERT [dbo].[tbl_carimage] ([car_imageid], [image_url], [carid]) VALUES (N'9', N'https://cdn.chotot.com/AEHRQlm5STZHcbcnZXQEBo9a5v1wpRuETF96ghMj510/preset:view/plain/7ea3f9db228971863eadb63e6d86f211-2824948392306875476.jpg', N'2')
GO
