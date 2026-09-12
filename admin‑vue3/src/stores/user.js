import { defineStore } from 'pinia'
export const useUserStore = defineStore('user', {
    state: () => ({
        token: '',
        userInfo: {}
    }),
    actions: {
        setToken(token) {
            this.token = token
        },
        setUserInfo(info) {
            this.userInfo = info
        },
        // 登出清空
        logout() {
            this.token = ''
            this.userInfo = {}
        }
    },
    persist: true // 开启持久化，自动存localStorage，刷新不丢
})
