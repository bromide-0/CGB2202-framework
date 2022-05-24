import Vue from 'vue'
import VueRouter from 'vue-router'
import LoginView from '../views/LoginView.vue'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    component: LoginView,
    meta:{
      title:'用户登录'
    }
  },
  {
    path: '/admin',
    redirect:'/admin/user/list',
    component: () => import( '../views/AdminView.vue'),
    children:[
      {
        path:"user/list",
        component:() => import('../views/admin/UserListView.vue'),
        meta:{
          title: "用户列表"
        }
      },
      {
        path:"user/add-new",
        component:() => import('../views/admin/UserAddNewView.vue'),
        meta:{
          title: "增加用户"
        }
      },
    ]
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})
router.beforeEach((to, from, next) => {
  if (to.meta.title) {
    document.title = to.meta.title
  }
  next()
})
export default router
