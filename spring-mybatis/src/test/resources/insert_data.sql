insert into ams_admin (username, password)
values ('admin001', '123456')
     , ('admin002', '123456')
     , ('admin003', '123456')
     , ('admin004', '123456')
     , ('admin005', '123456');

insert into ams_permission (name, value, description)
values ('商品-商品管理-读取', '/pms/product/read', '读取商品数据，含列表、详情、查询等'),
       ('商品-商品管理-编辑', '/pms/product/update', '修改商品数据'),
       ('商品-商品管理-删除', '/pms/product/delete', '删除商品数据'),
       ('后台管理-管理员-读取', '/ams/admin/read', '读取管理员数据，含列表、详情、查询等'),
       ('后台管理-管理员-编辑', '/ams/admin/update', '编辑管理员数据'),
       ('后台管理-管理员-删除', '/ams/admin/delete', '删除管理员数据');

insert into ams_role (name)
values ('超级管理员'),
       ('系统管理员'),
       ('商品管理员'),
       ('订单管理员');

insert into ams_admin_role (admin_id, role_id)
values (1, 1),
       (1, 2),
       (1, 3),
       (1, 4),
       (2, 1),
       (2, 2),
       (2, 3),
       (3, 1),
       (3, 2),
       (4, 1);