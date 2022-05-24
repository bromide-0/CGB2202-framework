<template>
  <div>
    <el-container>
      <el-header class="layout-header">
        <h3>上半部分</h3>
      </el-header>
      <el-container class="layout-body">
        <el-aside class="layout-aside">
          <el-menu
                  router=""
                  default-active="2"
                  class="el-menu-vertical-demo"
                  background-color="greenyellow"
          text-color="red">
            <el-submenu index="1">
              <template slot="title">
                <i class="el-icon-location"></i>
                <span>用户管理</span>
              </template>
                <el-menu-item index="/admin/user/add-new">
                  <i class="el-icon-location"></i>
                  <span>增加用户</span>
                </el-menu-item>
                <el-menu-item index="/admin/user/list">
                  <i class="el-icon-location"></i>
                  <span>用户列表</span>
                </el-menu-item>
            </el-submenu>
          </el-menu>
        </el-aside>
        <el-main>
          <router-view/>
        </el-main>
      </el-container>
    </el-container>
  </div>
</template>
<style>
  * {margin: 0}
  .layout-header {background: rebeccapurple;color: white}
  .layout-aside {background: greenyellow}
  .layout-body {position: absolute;top: 60px;bottom: 0;left: 0;right: 0}
</style>