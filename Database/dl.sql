USE [QLNhaThuoc]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 14/12/2018 1:46:54 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[maCTHD] [int] IDENTITY(1,1) NOT NULL,
	[maHD] [int] NOT NULL,
	[tenSP] [nvarchar](255) NOT NULL,
	[soLuongBan] [int] NOT NULL,
	[gia] [decimal](18, 2) NOT NULL,
	[thanhTien] [decimal](18, 2) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maCTHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 14/12/2018 1:46:54 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[maHD] [int] IDENTITY(1,1) NOT NULL,
	[tenKH] [nvarchar](255) NOT NULL,
	[ngayLap] [date] NOT NULL,
	[sdt] [nvarchar](15) NOT NULL,
	[diaChi] [nvarchar](255) NOT NULL,
	[tongTien] [decimal](18, 2) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maHD] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhanVien]    Script Date: 14/12/2018 1:46:54 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhanVien](
	[maNhanVien] [int] IDENTITY(1,1) NOT NULL,
	[tenNV] [nvarchar](255) NOT NULL,
	[sdt] [nvarchar](20) NOT NULL,
	[chucVu] [nvarchar](100) NOT NULL,
	[luong] [float] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maNhanVien] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TAIKHOAN]    Script Date: 14/12/2018 1:46:54 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TAIKHOAN](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[username] [nvarchar](50) NOT NULL,
	[password] [nvarchar](50) NOT NULL,
	[role] [nvarchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[THUOC]    Script Date: 14/12/2018 1:46:54 CH ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[THUOC](
	[maThuoc] [int] IDENTITY(1,1) NOT NULL,
	[tenThuoc] [nvarchar](255) NOT NULL,
	[hangSX] [nvarchar](255) NOT NULL,
	[ngaySX] [date] NOT NULL,
	[hanSD] [date] NOT NULL,
	[gia] [decimal](18, 2) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[maThuoc] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[ChiTietHoaDon] ON 

INSERT [dbo].[ChiTietHoaDon] ([maCTHD], [maHD], [tenSP], [soLuongBan], [gia], [thanhTien]) VALUES (1, 1, N'jjj', 9, CAST(8.00 AS Decimal(18, 2)), CAST(72.00 AS Decimal(18, 2)))
INSERT [dbo].[ChiTietHoaDon] ([maCTHD], [maHD], [tenSP], [soLuongBan], [gia], [thanhTien]) VALUES (2, 2, N'jj', 5, CAST(7.00 AS Decimal(18, 2)), CAST(35.00 AS Decimal(18, 2)))
INSERT [dbo].[ChiTietHoaDon] ([maCTHD], [maHD], [tenSP], [soLuongBan], [gia], [thanhTien]) VALUES (3, 3, N'fff', 6, CAST(50.00 AS Decimal(18, 2)), CAST(300.00 AS Decimal(18, 2)))
INSERT [dbo].[ChiTietHoaDon] ([maCTHD], [maHD], [tenSP], [soLuongBan], [gia], [thanhTien]) VALUES (4, 6, N'uuuuu', 10, CAST(9.00 AS Decimal(18, 2)), CAST(90.00 AS Decimal(18, 2)))
INSERT [dbo].[ChiTietHoaDon] ([maCTHD], [maHD], [tenSP], [soLuongBan], [gia], [thanhTien]) VALUES (5, 7, N'uuuuu', 10, CAST(9.00 AS Decimal(18, 2)), CAST(90.00 AS Decimal(18, 2)))
INSERT [dbo].[ChiTietHoaDon] ([maCTHD], [maHD], [tenSP], [soLuongBan], [gia], [thanhTien]) VALUES (6, 7, N'kkk', 6, CAST(9.00 AS Decimal(18, 2)), CAST(54.00 AS Decimal(18, 2)))
INSERT [dbo].[ChiTietHoaDon] ([maCTHD], [maHD], [tenSP], [soLuongBan], [gia], [thanhTien]) VALUES (7, 8, N'jjj', 5, CAST(5.00 AS Decimal(18, 2)), CAST(25.00 AS Decimal(18, 2)))
SET IDENTITY_INSERT [dbo].[ChiTietHoaDon] OFF
GO
SET IDENTITY_INSERT [dbo].[HoaDon] ON 

INSERT [dbo].[HoaDon] ([maHD], [tenKH], [ngayLap], [sdt], [diaChi], [tongTien]) VALUES (1, N'iii', CAST(N'2001-12-12' AS Date), N'888', N'999', CAST(0.00 AS Decimal(18, 2)))
INSERT [dbo].[HoaDon] ([maHD], [tenKH], [ngayLap], [sdt], [diaChi], [tongTien]) VALUES (2, N'jj', CAST(N'2002-12-12' AS Date), N'jjj', N'jjj', CAST(0.00 AS Decimal(18, 2)))
INSERT [dbo].[HoaDon] ([maHD], [tenKH], [ngayLap], [sdt], [diaChi], [tongTien]) VALUES (3, N'fff', CAST(N'2012-11-11' AS Date), N'fff', N'fff', CAST(0.00 AS Decimal(18, 2)))
INSERT [dbo].[HoaDon] ([maHD], [tenKH], [ngayLap], [sdt], [diaChi], [tongTien]) VALUES (6, N'uuu', CAST(N'2001-11-11' AS Date), N'01235', N'jjjjjj', CAST(90.00 AS Decimal(18, 2)))
INSERT [dbo].[HoaDon] ([maHD], [tenKH], [ngayLap], [sdt], [diaChi], [tongTien]) VALUES (7, N'uuu', CAST(N'2001-11-11' AS Date), N'01235', N'jjjjjj', CAST(144.00 AS Decimal(18, 2)))
INSERT [dbo].[HoaDon] ([maHD], [tenKH], [ngayLap], [sdt], [diaChi], [tongTien]) VALUES (8, N'jjj', CAST(N'1900-01-01' AS Date), N'555', N'55', CAST(25.00 AS Decimal(18, 2)))
SET IDENTITY_INSERT [dbo].[HoaDon] OFF
GO
SET IDENTITY_INSERT [dbo].[NhanVien] ON 

INSERT [dbo].[NhanVien] ([maNhanVien], [tenNV], [sdt], [chucVu], [luong]) VALUES (1, N'eee', N'0366666', N'eee', 23300)
SET IDENTITY_INSERT [dbo].[NhanVien] OFF
GO
SET IDENTITY_INSERT [dbo].[TAIKHOAN] ON 

INSERT [dbo].[TAIKHOAN] ([id], [username], [password], [role]) VALUES (1, N'admin', N'admin123', N'admin')
INSERT [dbo].[TAIKHOAN] ([id], [username], [password], [role]) VALUES (9, N'user1', N'user123', N'User')
SET IDENTITY_INSERT [dbo].[TAIKHOAN] OFF
GO
SET IDENTITY_INSERT [dbo].[THUOC] ON 

INSERT [dbo].[THUOC] ([maThuoc], [tenThuoc], [hangSX], [ngaySX], [hanSD], [gia]) VALUES (5, N'jjj', N'lll', CAST(N'2011-11-11' AS Date), CAST(N'2011-11-11' AS Date), CAST(50.00 AS Decimal(18, 2)))
INSERT [dbo].[THUOC] ([maThuoc], [tenThuoc], [hangSX], [ngaySX], [hanSD], [gia]) VALUES (6, N'k55', N'jjjj', CAST(N'2015-12-25' AS Date), CAST(N'2054-11-11' AS Date), CAST(555.00 AS Decimal(18, 2)))
SET IDENTITY_INSERT [dbo].[THUOC] OFF
GO
SET ANSI_PADDING ON
GO
/****** Object:  Index [UQ__TAIKHOAN__F3DBC57226DF2D96]    Script Date: 14/12/2018 1:46:54 CH ******/
ALTER TABLE [dbo].[TAIKHOAN] ADD UNIQUE NONCLUSTERED 
(
	[username] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, SORT_IN_TEMPDB = OFF, IGNORE_DUP_KEY = OFF, ONLINE = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
GO
ALTER TABLE [dbo].[HoaDon] ADD  DEFAULT ((0)) FOR [tongTien]
GO
ALTER TABLE [dbo].[ChiTietHoaDon]  WITH CHECK ADD FOREIGN KEY([maHD])
REFERENCES [dbo].[HoaDon] ([maHD])
GO
