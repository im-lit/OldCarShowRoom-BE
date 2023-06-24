USE [OldCarShowroom]
GO
INSERT [dbo].[tbl_carbrand] ( [car_brand_name], [logo_url]) VALUES ( N'Nissan', N'https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Nissan_logo.png/1196px-Nissan_logo.png')
GO
INSERT [dbo].[tbl_carbrand] ( [car_brand_name], [logo_url]) VALUES ( N'BMW', N'https://cdn.freebiesupply.com/logos/large/2x/bmw-2-logo-png-transparent.png')
GO
INSERT [dbo].[tbl_carbrand] ( [car_brand_name], [logo_url]) VALUES ( N'Mercedes-Benz', N'https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Mercedes-Logo.svg/2048px-Mercedes-Logo.svg.png')
GO
INSERT [dbo].[tbl_carbrand] ( [car_brand_name], [logo_url]) VALUES ( N'Toyota', N'https://global.toyota/pages/global_toyota/mobility/toyota-brand/emblem_ogp_001.png')
GO
INSERT [dbo].[tbl_carbrand] ( [car_brand_name], [logo_url]) VALUES ( N'Ford', N'https://global.toyota/pages/global_toyota/mobility/toyota-brand/emblem_ogp_001.png')
GO
INSERT [dbo].[tbl_carbrand] ( [car_brand_name], [logo_url]) VALUES ( N'Vinfast', N'https://upload.wikimedia.org/wikipedia/commons/thumb/2/29/Logo_of_VinFast_%283D%29.svg/1986px-Logo_of_VinFast_%283D%29.svg.png')
GO
INSERT [dbo].[tbl_carbrand] ( [car_brand_name], [logo_url]) VALUES ( N'Honda', N'https://w7.pngwing.com/pngs/26/42/png-transparent-honda-logo-car-honda-hr-v-honda-freed-honda.png')
GO
INSERT [dbo].[tbl_carbrand] ( [car_brand_name], [logo_url]) VALUES ( N'LandRover', N'https://upload.wikimedia.org/wikipedia/en/thumb/4/4a/LandRover.svg/1200px-LandRover.svg.png')
GO
INSERT [dbo].[tbl_cartype] ( [car_type_name]) VALUES ( N'SEDAN')
GO
INSERT [dbo].[tbl_cartype] ( [car_type_name]) VALUES ( N'SUV')
GO
INSERT [dbo].[tbl_cartype] ( [car_type_name]) VALUES ( N'Hatchback')
GO
INSERT [dbo].[tbl_cartype] ( [car_type_name]) VALUES ( N'Pickup')
GO
INSERT [dbo].[tbl_cartype] ( [car_type_name]) VALUES ( N'Truck')
GO
INSERT [dbo].[tbl_cartype] ( [car_type_name]) VALUES ( N'MiniVan')
GO
INSERT [dbo].[tbl_cartype] ( [car_type_name]) VALUES ( N'VF 5')
GO
INSERT [dbo].[tbl_cartype] ( [car_type_name]) VALUES ( N'C Class')
GO
INSERT [dbo].[tbl_role] ( [role_name]) VALUES ( N'admin')
GO
INSERT [dbo].[tbl_role] ( [role_name]) VALUES ( N'customer')
GO
INSERT [dbo].[tbl_role] ( [role_name]) VALUES ( N'showroom''s owner')
GO
INSERT [dbo].[tbl_user] ( [address], [avatar_url], [full_name], [password], [phone], [status], [user_name], [roleid]) VALUES ( N'137 Lê Ðại Hành', N'0', N'admin', N'123', N'0909090909', 1, N'admin', N'1')
GO
INSERT [dbo].[tbl_user] ( [address], [avatar_url], [full_name], [password], [phone], [status], [user_name], [roleid]) VALUES ( N'301 Lê Thánh Tôn', N'https://pbs.twimg.com/media/BtFUrp6CEAEmsml.jpg', N'Nguyễn Đăng Quang', N'123', N'0909090908', 1, N'quangnguyen', N'2')
GO
INSERT [dbo].[tbl_user] ( [address], [avatar_url], [full_name], [mail], [password], [phone], [status], [user_name], [roleid]) VALUES ( N'202 Trần Đại Tôn', N'https://cafefcdn.com/203337114487263232/2022/3/5/photo-4-16464479768131189701730.jpg', N'Nguyễn Thái Hoàn', NULL, N'123', N'0808080808', 1, N'hoanowner', 3)
GO
INSERT [dbo].[tbl_user] ( [address], [avatar_url], [full_name], [mail], [password], [phone], [status], [user_name], [roleid]) VALUES ( N'77 Thới An', N'https://pbs.twimg.com/media/BtFUrp6CEAEmsml.jpg', N'Nguyễn Trần Nam Long', NULL, N'123', N'0797986546', 1, N'longowner', 3)
GO
INSERT [dbo].[tbl_user] ( [address], [avatar_url], [full_name], [mail], [password], [phone], [status], [user_name], [roleid]) VALUES ( N'123 Trần Nhân Tông', N'https://pbs.twimg.com/media/BtFUrp6CEAEmsml.jpg', N'Nam Long Nguyễn', N'longntnse141021@fpt.edu.vn', N'123', N'0809645462', 1, N'longcus', 2)
GO
INSERT [dbo].[tbl_user] ( [address], [avatar_url], [full_name], [mail], [password], [phone], [status], [user_name], [roleid]) VALUES ( N'8 Lê Đức Thọ', N'https://i.pinimg.com/564x/56/c4/4b/56c44b62975cbfd8cd0172ccf9ec0cea.jpg', N'Pót Mà Lon', N'posty123@xam.com', N'123', N'0202020202', 1, N'postyowner', 3)
GO
INSERT [dbo].[tbl_user] ( [address], [avatar_url], [full_name], [mail], [password], [phone], [status], [user_name], [roleid]) VALUES ( N'9 Lê Văn Thọ', N'https://i.pinimg.com/564x/e5/db/09/e5db092e803b2cb6bb58f34e43a431b7.jpg', N'Nguyễn Văn Sà', N'21savage@xam.com', N'123', N'0303030303', 1, N'21savageowner', 3)
GO
INSERT [dbo].[tbl_user] ( [address], [avatar_url], [full_name], [mail], [password], [phone], [status], [user_name], [roleid]) VALUES ( N'10 Cây Trâm', N'https://i.pinimg.com/564x/05/59/ce/0559ce6c87beb685074391319336c06c.jpg', N'Trần Văn Boom', N'metro@xam.com', N'123', N'0404040404', 1, N'metroowner', 3)
GO
INSERT [dbo].[tbl_user] ( [address], [avatar_url], [full_name], [mail], [password], [phone], [status], [user_name], [roleid]) VALUES ( N'11 Quang Trung', N'https://i.pinimg.com/564x/81/eb/23/81eb232045068a0f49e920eb432d03d8.jpg', N'Lại Văn Cót', N'travis@xam.com', N'123', N'0505050505', 1, N'travisowner', 3)
GO
INSERT [dbo].[tbl_user] ( [address], [avatar_url], [full_name], [mail], [password], [phone], [status], [user_name], [roleid]) VALUES ( N'12 Nguyễn Văn Lượng', N'https://i.pinimg.com/564x/86/00/80/860080486da30c63d44cbe493da15394.jpg', N'Nguyễn Lợi Uzi', N'uzi@xam.com', N'123', N'0606060606', 1, N'uziowner', 3)
GO
INSERT [dbo].[tbl_showroom] ( [showroom_address], [showroom_avatar],[showroom_description], [showroom_name], [showroom_phone], [userid]) VALUES ( N'888 Trần Hưng Ðạo, Phường 12, Quận Phú Nhuận, Thành phố Hồ Chí Minh',N'https://i.pinimg.com/originals/ea/31/37/ea313708c16fededd3e13f52faa3e51d.jpg',N'Thái Hoàn Showroom đặt niềm tin thứ 2', N'Showroom Thai Hoan', N'0326486265', N'3')
GO
INSERT [dbo].[tbl_showroom] ( [showroom_address], [showroom_avatar],[showroom_description],[showroom_name], [showroom_phone], [userid]) VALUES ( N'79 Pasteur, Phường 12, Quận 1, Thành phố Hồ Chí Minh',N'https://cdn.batdongsan.com.vi/gpictures/500x250/1748/MnxBRjFRaXBOSXFoXzhvZ3REbng5SjZJUGRpVF9UNHNRYktTQWFpY2ZMTnA4aQ.jpg', N'Nam Long Auto Uy tín là số một ', N'Nam Long Auto', N'0564597563', N'4')
GO
INSERT [dbo].[tbl_showroom] ( [showroom_address], [showroom_avatar],[showroom_description],[showroom_name], [showroom_phone], [userid]) VALUES ( N'100 Nguyễn Kiệm, Phường 5, Quận Gò vấp, Thành phố Hồ Chí Minh',N'https://storage.googleapis.com/f1-cms/2019/07/dc909f8a-20190709_085218.jpg', N'AnyCar ', N'Showroom AnyCar', N'08979865423', N'6')
GO
INSERT [dbo].[tbl_showroom] ( [showroom_address], [showroom_avatar],[showroom_description],[showroom_name], [showroom_phone], [userid]) VALUES ( N'111 Nguyễn Thái Sơn, Phường 2, Quận Gò Vấp, Thành phố Hồ Chí Minh',N'https://topaz.vn/wp-content/uploads/2022/05/showroom-xe-o-to-tai-tphcm-1-1.jpg', N'Toyota Vĩnh Thái Showroom đặt niềm tin thứ 3 ', N'Toyota Vĩnh Thái Fukushima', N'0848563254', N'7')
GO
INSERT [dbo].[tbl_showroom] ( [showroom_address], [showroom_avatar],[showroom_description],[showroom_name], [showroom_phone], [userid]) VALUES ( N'969 Nguyễn Kiệm, Phường 11, Quận Gò vấp, Thành phố Hồ Chí Minh',N'https://cdn.cybercar.vn/services/800/garage-dang-quang-14880-14880-cybercar-vn.png', N'Ford thì ko xe ai mua rồi ', N' Ford Showroom Đăng Quang ', N'0909096326', N'8')
GO
INSERT [dbo].[tbl_showroom] ( [showroom_address], [showroom_avatar],[showroom_description],[showroom_name], [showroom_phone], [userid]) VALUES ( N'595 Thới An, Phường Tân Thới An, Quận 12, Thành phố Hồ Chí Minh',N'https://mir-s3-cdn-cf.behance.net/project_modules/max_1200/01e11b52937817.5922ad27c3e60.jpg', N'Scott Showroom được lấy tên từ rapper nổi tiếng TravisScott ', N'Scott Showroom', N'0265498756', N'9')
GO
INSERT [dbo].[tbl_showroom] ( [showroom_address], [showroom_avatar],[showroom_description],[showroom_name], [showroom_phone], [userid]) VALUES ( N'191 đường số 3, Phường 6, Quận Gò Vấp, Thành phố Hồ Chí Minh ',N'https://d1tm14lrsghf7q.cloudfront.net/public/media/23839/conversions/21819-thumb.jpg', N'Showroom Uzi lấy tên từ rapper nổi tiếng Uzi ', N'Showroom Uzi', N'0326986574', N'10')
GO

INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/jHHvzO_9lCzc1xgOsPPDZwKXoQ9w6rrlaAUrONjQqjM/preset:view/plain/65e283c1cf29f9693f8c24b8507bc792-2831262546353068534.jpg', N'Ðã sử dụng', N'Chính hãng WesternFord bán xe qua sử dụng Ford Ranger xls 4x2 MT, sản xuất năm 2017, đi được 81000km, nhập khẩu Thái Lan.Xe công ty đứng tên xuất hoá đơn.Xe đã được kiểm tra tổng quát chất lượng rất tốt.', N'Ranger XLS 4x2 MT', 81000, N'Mỹ', 449000000, N'CAN_SALE', 2017, N'5', N'4', N'1', N'3')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/x7XLFYVI8frvSuo6cs6mwNMxQ9BK9NyKBikE5LgV8UY/preset:view/plain/b2c30288ee8764845c9835cd47f25346-2829835520097404255.jpg', N'Đã sử dụng', N'Civic G Trắng 2022, ODO 28k km, keng như cây kiếm,giá chỉ 7xx.000.000 ( giá cực êm cho QKH thiện chí )
', N'Honda Civic G trắng giá tốt còn thương lượng', 28000, N'Thái Lan', 735000000, N'CAN_SALE', 2022, N'7', N'1', N'1', N'2')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/5Jcmb3QlphopA9vwBv4mkF7HNJ7RXWSVfK-jd44pFVk/preset:view/plain/daf49fd89da9be149e499947a47c383a-2824948392125029666.jpg', N'Mới', N'NamLong AUTO,79 Pasteur, Quận 1, Tp.HCM', N'VINFAST VF 5', 11000, N'Việt Nam', 428000000, N'CAN_SALE', 2023, N'6', N'7', N'2', N'4')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/NyGjnbV0ZiGfB2DS7gqs3sv51ZYeAm-_hwbpvu7qCbE/preset:view/plain/731070572a7baa195b2b849f550800c6-2828706568282839309.jpg', N'Đã sử dụng', N'Ngoại thất màu Đen, nội thất Kem siêu chảnh,Có rất nhiều công nghệ hiện đại: đèn Multibeam, loa Burmester, nước hoa Air-balance, màn che nắng kính sau chỉnh điện, sạc không dây, cốp điện, nhiều chế độ lái với Dynamic select,...', N'Mercedes C200 Exclusive 2020 ', 47000, N'Việt Nam', 1199000000, N'CAN_SALE', 2020, N'3', N'8', N'2', N'4')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/vsw-e2Rp88e7XdH3g9CCgHn0FWMmKeXcWLleXuSDo94/preset:view/plain/d76b2bf098b07e2fddc9cc46dcb726b3-2828740852989251664.jpg', N'Đã  sử dụng', N' Xe màu đen, nội thất đen. Xe trang bị hub kính, Loa Bum, Cửa nóc, rèm điện, calangAMG, Mâm 5 chất AMG, nước hoa', N'C300 AMG Sx 2016 Ðen Ðen full', 79000, N'Việt Nam', 988000000, N'CAN_SALE', 2016, N'3', N'8', N'2', N'4')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/C4yFCv0ni_wAJmfqzUU-N1SbkriGwzncxQpSIufGuAg/preset:view/plain/eab9c6cad0854b17ff68c7ac0037ace9-2822889962593694567.jpg', N'Đã sử dụng', N'MERCEDES BENZ C200 AVANGARDE MODEL 2023 - MỘT CHỦ TỪ ĐẦU,XE LƯỚT CHẤT LƯỢNG ✔ GIÁ TỐT', N'MERCEDES BENZ C200 AVANGARDE MODEL 2023', 7000, N'Đức', 1529000000, N'CAN_SALE', 2023, N'3', N'8', N'2', N'4')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/JijNyl_j9m8gB3JkqD0NQl6PTxFA4o2wexIGRIqAEJU/preset:view/plain/8b84e60ba2b10eeb5bc5da504e385ade-2827870198192250460.jpg', N'Đã sử dụng', N'Mercedes C250 2016 - Sang Xịn Mịn,Động cơ 2.0L, 211hp, Tối ưu nhiên liệu.Model Classic logo đứng sang trọng. Ốp gỗ Nâu bóng Walnut cao cấp.13 Loa Burmester 590 watt siêu đỉnh. Air Balance Máy nước hoa + Lọc không khí bụi mịn.', N'MERCEDES C250 2016 - SANG XỊN SIÊU ĐẸP', 170000, N'Đức', 679000000, N'CAN_SALE', 2016, N'3', N'8', N'2', N'4')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/me-AId4VXsGXrUeaEIxci7yGRpDJF43Y8ttc9sVdECs/preset:view/plain/b3b2a3c79f1039a2e916cce53d57b632-2828576827288131010.jpg', N'Đã sử dụng', N'TOYOTA LANDCRUISER PRADO TXL
Một chiếc *** - Up full 2020 : 300 triệu.
Xe Vũng Tàu, biển VIP 72A-123.23 ( ae được giữ biển nhé )
Sản xuất: 2014 - Odo zin: 65.000 Mile ( cực ít so với mấy bé cùng đời )
Đã lên Form 2020', N'Toyota LandCruiser Prado Up 2020 full đồ 300 triệu', 65000, N'VietNam', 1190000000, N'CAN_SALE', 2014, N'4', N'2', N'1', N'2')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/mbQRc-xqgkO6jVDo0cH1Te2PNAlUeAYod1KRe0_Aptk/preset:view/plain/315823dec2265704cda4c40cc3c1d9ce-2821583033624457739.jpg', N'Đã sử dụng', N'LandRover Range Rover Autobigraphy SDV8', N' Range Rover Autobiography 4.4 Diesel cao cấp 2014', 56237, N'Anh', 2699000000, N'CAN_SALE', 2014, N'8', N'2', N'1', N'2')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/LfILHMiLD6U5n2v0WsvuXTEtZu75V54m1jCuKTgnoxw/preset:view/plain/125e2b275e5f137120224b6d03a71306-2810415017537253593.jpg', N'Mới', N'HONDA CRV 2023 KM KHỦNG 150%. Đẹp cực khủng', N'HONDA CRV 2023 KM KHỦNG 150% TRƯỚC BẠ - GIÁ TỐT', 200, N'Nhật Bản', 1118000000, N'CAN_SALE', 2023, N'7', N'2', N'1', N'2')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/LfILHMiLD6U5n2v0WsvuXTEtZu75V54m1jCuKTgnoxw/preset:view/plain/125e2b275e5f137120224b6d03a71306-2810415017537253593.jpg', N'Đã sử dụng', N'Nissan Navara 2.5VL 2018 full kịch ODO 7 vạn gia đình đi rất giữ gìn , vẫn còn như mới
Xe được trang bị động cơ 2.5 mạnh mẽ 4x4 vượt mọi cung đường theo ý của mình
Trên xe rất nhiều tính năng như , cam lùi.
Hỗ trợ sang tên nhanh gọn', N'Nissan Navara VL 2018 2 cầu Full kịch ODO 7 vạn', 70000, N'Thái Lan', 538000000, N'CAN_SALE', 2018, N'1', N'4', N'2', N'6')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/UrCwUdy9-xkr87BNQ9CDrFwCGO0z5souRYloUMNDaVU/preset:view/plain/65ce923790be226c9f8b04c83b451532-2816862145027805310.jpg', N'Đã sử dụng', N'Xe một chủ từ đầu, zin tuyệt đối ,Bao check hãng, check thợ', N'Nissan Navada VL 4x4', 80000, N'Thái Lan', 505000000, N'CAN_SALE', 2016, N'1', N'4', N'2', N'6')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/t9ZEWja9fnXIvS9kqaFDRNUSooRoAShyXiLV6wYyzZ4/preset:view/plain/e7219891d8b14e13ffe277a1ba4ace42-2819150742986790362.jpg', N'Đã sử dụng', N' Cần bán Vinfast Lux-A 2.0 sản xuất 2021 chính chủ của tôi. Xe đi 2 vạn km, bảo dưỡng định kỳ đầy đủ tại hãng. Ai có nhu cầu vui lòng gọi trực tiếp.', N'Vinfast Lux-A 2.0 sx 2021', 10000, N'Việt Nam', 630000000, N'CAN_SALE', 2021, N'6', N'1', N'2', N'6')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/ePPUV6q8EVQcATrUbZltdvpdMrhRWkua0z0IjHz4dj0/preset:view/plain/90d149dac9549bddc7a72880e10fffdc-2827695370546723314.jpg', N'Đã sử dụng', N'Ranger Wildtrak 2.0 Bitubo sản xuất 2021 nhập khẩu
Odo 30.000km full lịch sử hãng 4 lốp theo xe sơ cua chưa hạ
Cam kết không lỗi nhỏ bao check nọi nơi khách hàng yêu cầu
LH để biết thêm thông tin chi', N'Ranger Wildtrak 2.0 Bitubo sx 2021 siêu chất', 30000, N'Mỹ', 738000000, N'CAN_SALE', 2021, N'5', N'4', N'2', N'6')
GO
INSERT [dbo].[tbl_car] ( [car_avatar], [car_condition], [car_description], [car_name], [car_odo], [car_origin], [car_price], [car_status], [year_of_registration], [car_brandid], [car_typeid], [showroomid], [userid]) VALUES ( N'https://cdn.chotot.com/VI-y4jwEI-hpCLSGm12OGJZaXH0yyJIkUZNHXcfHYPg/preset:view/plain/968d591587bddc42b18eabf194b34685-2830169299274071344.jpg', N'Đã sử dụng', N'Xe tên tư nhân, sx 2022 model 2023! Chưa vết xước, đã lắp nắp chụp thùng, dán kính, ghế da!', N'Ranger tự động Model 2023', 18000, N'Mỹ', 650000000, N'CAN_SALE', 2021, N'5', N'4', N'2', N'6')
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/jHHvzO_9lCzc1xgOsPPDZwKXoQ9w6rrlaAUrONjQqjM/preset:view/plain/65e283c1cf29f9693f8c24b8507bc792-2831262546353068534.jpg', 1)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/NgDTsaxLS82aEaUKHfKD6DRcenvoJDbkp5SkVj0L2eQ/preset:view/plain/d3e104c2e466ab221fb857bc48131ad8-2824948392310315506.jpg', 3)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/NyGjnbV0ZiGfB2DS7gqs3sv51ZYeAm-_hwbpvu7qCbE/preset:view/plain/731070572a7baa195b2b849f550800c6-2828706568282839309.jpg', 4)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/8sE_yll6_SHDJEihe-d2byyat8YtBViVftLLdudnvQc/preset:view/plain/fae0c37b4b4ee14f3bb1b292d9673148-2828706567202695301.jpg', 4)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/0tOAn7cm-29OmGwODLbQJhuFpynNnYWgU0ecEYIn_X8/preset:view/plain/179317a00dd05514a009be586974898b-2828706567571334999.jpg', 4)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/LuqnjaPsYBVQNdpKBPpoaS3JcY1kf_O6052RfG278xo/preset:view/plain/806285860718f349193b078aa2af918e-2828706567524746387.jpg', 4)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/d9iR4gJLJ84RVxdlKglBvX5PzI2ZImLJEHt3fZKkq1c/preset:view/plain/1229303f75721310121190e4c5d18a43-2828706567559203721.jpg', 4)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/vsw-e2Rp88e7XdH3g9CCgHn0FWMmKeXcWLleXuSDo94/preset:view/plain/d76b2bf098b07e2fddc9cc46dcb726b3-2828740852989251664.jpg', 5)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/E_CQKZt-OFuNLpcuU1ozXPtLbA-RHlH7ubim-Q9tuuw/preset:view/plain/30d321de5776ad84dbe97b9f760d15ba-2828740852423019401.jpg', 5)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/gx84NiFCJfoAP18ZiFWU_uXoqWkIiFI1atpU_KHLjrQ/preset:view/plain/11fd9a7018b28429a2c46ab79854bae2-2828740851879196215.jpg', 5)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/2PkGPG7KcVhJC3Nck_TKHiDeeMgb9hfzLiPiAv3808A/preset:view/plain/0f9a2248bf3dec816e6c8fb444bd00c2-2828740849547097655.jpg', 5)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/_dWGd4AKoWXTCFy5dIaTZiUQ94ifmmcHrtJxUhc8Xfw/preset:view/plain/7e01a7d50abdef8aff0d50957d104676-2831262546234814919.jpg', 1)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/Oi-vhj92qPnJph7XuK-hPb_gG7Wuekcw6SHWuOBFlsc/preset:view/plain/2785198c278aea05b5bad036e4d48d0d-2828740852974249815.jpg', 4)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/6ZOOMbic_cWigMnjDJ12mdmh8onTSRzWCapRxr0VhQQ/preset:view/plain/692dc2835739814c66846e76bfd310a4-2828740852347949756.jpg', 4)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/C4yFCv0ni_wAJmfqzUU-N1SbkriGwzncxQpSIufGuAg/preset:view/plain/eab9c6cad0854b17ff68c7ac0037ace9-2822889962593694567.jpg', 6)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/LIIL5fhVG_mgudpxyw7aKn4ISXKxaOlllFmeEWhz5Bs/preset:view/plain/c6a02db0fee36e224fe0ea4d20f9e9e3-2822889965041232326.jpg', 6)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/80rXwMkHbFmrS81E9byeHU67yuJz3nHHc-ruvCHNQsg/preset:view/plain/4a816c868899a384efddd9515411cd85-2822889963552620114.jpg', 6)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/UAhQog9SxYXRcTNL_q32b2sPpfzPBLqCrrl9hwiRMO4/preset:view/plain/03b84360c37de69718359ce942e03acd-2822889962205817286.jpg', 6)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/OaLFrqJl0i5HIBYGJa9L4caXuGvbFmGET2NVhtTNBjo/preset:view/plain/d993c07e0f08c0829712402630276266-2822889966211648379.jpg', 6)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/TB1v7xu1DjUK5niC-GXYfSiK4mcIDUpSTJ9Wrag4G1s/preset:view/plain/6cff74bb9c02eb78be8936fd60994dc7-2822889966575698392.jpg', 6)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/nsOjvXnnG9it_BmfgVAW7htUB1E-01560OnJZsOZIDI/preset:view/plain/9a5bd92c18e40ea1a5f911f669f5653a-2822889965475109707.jpg', 6)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/me-AId4VXsGXrUeaEIxci7yGRpDJF43Y8ttc9sVdECs/preset:view/plain/b3b2a3c79f1039a2e916cce53d57b632-2828576827288131010.jpg', 8)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/3XtZekFK2xVA9PHDTTw5Q7qBabeuRylLFa5J_oryFbU/preset:view/plain/4b0a254a51efa6b20cc9d5467341d341-2831262546086191565.jpg', 1)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/wN5RAk4FaKl9OddMKNRHibXlY7aNqXFiaeue88Sg4NE/preset:view/plain/7671b286b5b1336e5b92b3d7184b70bb-2828576827663877945.jpg', 8)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/ZkpbHKllWe4GprWO-QI410w2crGTw7PZHrq_J4W7nas/preset:view/plain/ba6e828a79d9be62de465d2ca61c2933-2828576828923290335.jpg', 8)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/12_E0ZeBUJCoVp_miUUo_lZx7ld1VzpcYedWEwceUDg/preset:view/plain/3bf0ba692d75b4a7e04d643dd644709d-2828576827797413715.jpg', 8)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/iKVfqpnAwwp0M58mb32J3xwf06VUX-HKBZshlNDmGHk/preset:view/plain/2264979574c0fa8cd50711cb32054186-2828576827733840905.jpg', 8)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/bcvGcss2uyx9UxH8rMpsuKzFQ9saQR69NH6uPvw_sUs/preset:view/plain/762f88d4c2c1753b7782d8135aa7ffbc-2828576828295849570.jpg', 8)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/RNZOxcXMUMcmfbn1eVCwiOvu6p3SKd7GSK070CrTGQo/preset:view/plain/22ab5017a0324c9f98c1c7077833414e-2828576828793088499.jpg', 8)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/mbQRc-xqgkO6jVDo0cH1Te2PNAlUeAYod1KRe0_Aptk/preset:view/plain/315823dec2265704cda4c40cc3c1d9ce-2821583033624457739.jpg', 9)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/FMW8PGN7Gi_UpdOkGdbzTzxGEFCBs2NEVjH6eTpCSvc/preset:view/plain/577d731b514b8210b7ac54b5b83c326a-2821583033875859612.jpg', 9)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/aeWsxAiwfegQ0neefPJiVZXAYR9Q7VPMhz983rrc4AM/preset:view/plain/61b9707d6a59af283fd7d71c50397eb8-2821583032872458061.jpg', 9)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/TF6e4EKxUJX-95ks7veNzOIaOANIM1j2UetA7nL8QLI/preset:view/plain/5b9613d15b01b35a0a28870636c0b4b2-2821583033338580296.jpg', 9)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/pu5LaNzgp_jrQE320FM5CBVeuHbh-86--aZ4SD9lXNo/preset:view/plain/20b58d48ca2c570a4a3ef4d5e331f129-2831262545930286874.jpg', 1)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/UaNfuGENDz23sPX7Uhc52JkohCzHDeuU2nofiI7a_oY/preset:view/plain/c57852703103c8cfc0f653d224e07147-2821583033780172084.jpg', 9)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/3_vbVBjZkORbOe53rcHbm2Gw7iqi2iaWjK5il38FMes/preset:view/plain/e2abf7f62e393decef82e1e1bbd71599-2821583033455310021.jpg', 9)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/LfILHMiLD6U5n2v0WsvuXTEtZu75V54m1jCuKTgnoxw/preset:view/plain/125e2b275e5f137120224b6d03a71306-2810415017537253593.jpg', 10)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/czEbK94qk1oiE7kgjR80vMgAZcpTLlMGknJppXcwnfo/preset:view/plain/bec77dfd46b8683d6721a11fba641cc5-2810415036537494443.jpg', 10)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/td0nsBNb0Jlt9obd8bzikKF8xvqWekbLAEJYFVVORPA/preset:view/plain/ad90e84fc56935fc83f5e5c677f6b12d-2810415036704278352.jpg', 10)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/vEa57YAHLPSEusDtQhlaCxm05-n6oKSzVpDCVkZ-Y-Y/preset:view/plain/8b5f964a5ae95d347b94abacde943f65-2810415036680127673.jpg', 10)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/uxH3XVhIQo4UjBKekJ1uOlzSoXZmp2OeGVDLdFIj5BM/preset:view/plain/f26b8496ad70d40ce18f8987e9759807-2810415037168582909.jpg', 10)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/7v6YLNwBo8p2rw_JH_wHjt7sV-L6E0JMxNJ8L1BRK1Y/preset:view/plain/75e57107588ba0d5b043fd52ac5814d8-2810415036517362311.jpg', 10)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/jGijVO1r24CyfFNBpzqOVWoN49eeGUyV9xCM7Ztm72o/preset:view/plain/4f77d0cea72988ec72823f4b2fb3c000-2810415036867702920.jpg', 10)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/x7XLFYVI8frvSuo6cs6mwNMxQ9BK9NyKBikE5LgV8UY/preset:view/plain/b2c30288ee8764845c9835cd47f25346-2829835520097404255.jpg', 2)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/yjNiw18PQVu3l1Os4Es6usnK1gpVpC05FmPzDeRUA_k/preset:view/plain/3e44e92b6a7542902b15662ecf734fbf-2831262546215403941.jpg', 1)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/u1GcMeshQqqEiNqYWlVtCNeJZ7XySYrmgsLlxSeZUxI/preset:view/plain/abe74fa2ceb0af702be4434a2a8c9c2f-2829835520240535157.jpg', 2)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/upRRXEIxP5zwtoUt_HJOqCkXTy9Raghd4d5q3pD6H2w/preset:view/plain/73fc097c8b31e90cd97ba1ecf00f8fc9-2829835520307719062.jpg', 2)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/5FUDSOhZ-42gd9w8OjHf_AdxsNqEDH_aH_G-Bv6SY68/preset:view/plain/07632a3380a0a03928ec3bf08dcc7500-2829835520171858014.jpg', 2)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/2wP-BfwwaYB43am2ne99GiR0Rv15C391lhia7OLsbPc/preset:view/plain/35e4f68b79aa09a0fa2663567451f387-2829835520232659356.jpg', 2)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/JS2YBa0_AbCWVBkqTeu3qWrv3Vaug3Iao8iQWzlznQ4/preset:view/plain/5f15c11a820b69f59b1328fda333e93a-2829835520070392224.jpg', 2)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/JijNyl_j9m8gB3JkqD0NQl6PTxFA4o2wexIGRIqAEJU/preset:view/plain/8b84e60ba2b10eeb5bc5da504e385ade-2827870198192250460.jpg', 7)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/eAzjedYWyoIeO55LzCWIdwUg-KEcPa3chnKtajZlrtE/preset:view/plain/6984de8023ab8e2f7ab3653fbe669bfc-2827870198513986114.jpg', 7)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/FWzuuNqjDUemDiSNoJXUSuqeAvqjL4v1ZvB0b7P8gAg/preset:view/plain/e5da7f2bed09f486ff52ef3b42a6d19b-2827870198494944107.jpg', 7)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/DZ88O3i2Dj_CscbE7yScRQSQ5YvYdcredDgay-51LBs/preset:view/plain/fe31bcf3ddb35496ca32c4fba3788022-2827870198522233484.jpg', 7)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/EWF8DvJhaZMV_cPYIgKGSBaRyURrJIBQ3JtHZm11fag/preset:view/plain/587c0c54203ae9261fddf6c6f4e452bc-2827870198465799063.jpg', 7)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/MkDaGkAmuTE7rSBfUI7YLi8Vh4mdx03eveqzB9nC6V8/preset:view/plain/82e181dc0629818c09513639fd7a3be6-2831262546400950450.jpg', 1)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/chUAMypaJnzg8ktd9HHFdaF4f2syQr2u4F5kgAipw9g/preset:view/plain/04a23d3f199fe1289c6b6a86f5b74c1a-2827870198622027301.jpg', 7)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/wtkd0T-A-5pikn_oczUIHhi7zFBPNaHgbaK0v6KikYk/preset:view/plain/8acf8b18e2f5da622e413be411755354-2827870198506411642.jpg', 7)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/PxrPf0go51DXGfjlO9Amj3XwgYwXjid0RBTof7TegoE/preset:view/plain/0db61e2d5f44725f53e61f42aa4eb35f-2827870198509948054.jpg', 7)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/mBETh1D0AWORship7dAzyU_h2ufuvXeYqEFzz6gltck/preset:view/plain/c0da918b3ad9fa4901145ce24d10c954-2831262546335610595.jpg', 1)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/5Jcmb3QlphopA9vwBv4mkF7HNJ7RXWSVfK-jd44pFVk/preset:view/plain/daf49fd89da9be149e499947a47c383a-2824948392125029666.jpg', 3)
GO
INSERT [dbo].[tbl_carimage] ( [image_url], [carid]) VALUES ( N'https://cdn.chotot.com/AEHRQlm5STZHcbcnZXQEBo9a5v1wpRuETF96ghMj510/preset:view/plain/7ea3f9db228971863eadb63e6d86f211-2824948392306875476.jpg', 3)
