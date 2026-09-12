import { createRouter, createWebHistory } from 'vue-router'
import { useUserStore } from '../stores/user'

const routes = [
    { path: '/', redirect: '/login' },
    { path: '/login', component: () => import('@/views/login.vue') },
    { path: '/admin', component: () => import('@/views/admin/index.vue') },
    { path: '/student', component: () => import('@/views/student/index.vue') }
]

const router = createRouter({
    history: createWebHistory(),
    routes
})

router.beforeEach((to, from, next) => {
    const userStore = useUserStore()
    const token = userStore.token
    if (to.path === '/login') {
        next()
    } else {
        if (token) {
            next()
        } else {
            next('/login')
        }
    }
})

export default router
