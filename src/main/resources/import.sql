-- Cái này auto-run nên chỉ cần viết cấu lênh sql bên dưới là OK

insert into loai_dia values ('Movie',30000,5);
insert into loai_dia values ('Game',40000,7);

insert into tieu_de values ('TN-1', N' Phim mới nhập từ JP', N'91 Day servival', 'Movie');
insert into tieu_de values ('TN-2', N' Phim mới', N'Transformer', 'Movie');
insert into tieu_de values ('TN-3', N' Game nhập vai và hành động', N'Dark War', 'Game');
insert into tieu_de values ('TN-4', N' Game kinh dị của mọi thời đại', N'Finding Murderer', 'Game');

insert into dia (ma_dia, trang_thai, ma_tieu_de) values ('DN-1',N'Trên kệ','TN-1');
insert into dia (ma_dia, trang_thai, ma_tieu_de) values ('DN-2',N'Trên kệ','TN-1');
insert into dia (ma_dia, trang_thai, ma_tieu_de) values ('DN-3',N'Trên kệ','TN-1');
insert into dia (ma_dia, trang_thai, ma_tieu_de) values ('DN-4',N'Trên kệ','TN-1');
insert into dia (ma_dia, trang_thai, ma_tieu_de) values ('DN-5',N'Trên kệ','TN-2');
insert into dia (ma_dia, trang_thai, ma_tieu_de) values ('DN-6',N'Trên kệ','TN-2');
insert into dia (ma_dia, trang_thai, ma_tieu_de) values ('DN-7',N'Trên kệ','TN-3');
insert into dia (ma_dia, trang_thai, ma_tieu_de) values ('DN-8',N'Trên kệ','TN-3');
insert into dia (ma_dia, trang_thai, ma_tieu_de) values ('DN-9',N'Trên kệ','TN-4');

insert into khach_hang values ('CN-1', N'Quang Trung, Gò Vấp', N'Nguyễn Văn A', 1, '01010101');
insert into khach_hang values ('CN-2', N'Quang Trung, Gò Vấp', N'Nguyễn Văn B', 1, '01010101');
insert into khach_hang values ('CN-3', N'Quang Trung, Gò Vấp', N'Nguyễn Văn C', 1, '01010101');

insert into phieu_thue values ('RN-1', '20180202', 'CN-1');

insert into chi_tiet_phieu_thue values ('RDN-1', '20180303', 50000, 'DN-1', 'RN-1');
insert into chi_tiet_phieu_thue values ('RDN-2', '20180303', 50000, 'DN-1', 'RN-1');
insert into chi_tiet_phieu_thue values ('RDN-3', '20180303', 50000, 'DN-1', 'RN-1');

insert into chi_tiet_no values ('RDN-1', 10000);
insert into chi_tiet_no values ('RDN-2', 10000);