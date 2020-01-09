import Auth from "@okta/okta-vue";
import Vue from 'vue'
import Router from 'vue-router'
import Todos from './components/Todos'

Vue.use(Auth, {
    issuer: 'https://dev-902066.okta.com/oauth2/default',
    client_id: '0oa2fk12oqfawZD38357',
    redirect_uri: window.location.origin + '/implicit/callback',
    scope: 'openid profile email'
});

Vue.use(Router);

let router = new Router({
    mode: 'history',
    routes: [
        {
            path: '/',
            name: 'Todos',
            component: Todos,
            meta: {
                requiresAuth: true
            }
        },
        {
            path: '/implicit/callback',
            component: Auth.handleCallback(),
        },
    ]
});

router.beforeEach(Vue.prototype.$auth.authRedirectGuard());

export default router;