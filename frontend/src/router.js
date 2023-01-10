
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import OrderManager from "./components/listers/OrderCards"
import OrderDetail from "./components/listers/OrderDetail"

import ProductSelectionView from "./components/ProductSelectionView"
import ProductSelectionViewDetail from "./components/ProductSelectionViewDetail"
import OrderInquiryView from "./components/OrderInquiryView"
import OrderInquiryViewDetail from "./components/OrderInquiryViewDetail"
import ProductManager from "./components/listers/ProductCards"
import ProductDetail from "./components/listers/ProductDetail"

import DeliveryManager from "./components/listers/DeliveryCards"
import DeliveryDetail from "./components/listers/DeliveryDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/orders',
                name: 'OrderManager',
                component: OrderManager
            },
            {
                path: '/orders/:id',
                name: 'OrderDetail',
                component: OrderDetail
            },

            {
                path: '/productSelections',
                name: 'ProductSelectionView',
                component: ProductSelectionView
            },
            {
                path: '/productSelections/:id',
                name: 'ProductSelectionViewDetail',
                component: ProductSelectionViewDetail
            },
            {
                path: '/orderInquiries',
                name: 'OrderInquiryView',
                component: OrderInquiryView
            },
            {
                path: '/orderInquiries/:id',
                name: 'OrderInquiryViewDetail',
                component: OrderInquiryViewDetail
            },
            {
                path: '/products',
                name: 'ProductManager',
                component: ProductManager
            },
            {
                path: '/products/:id',
                name: 'ProductDetail',
                component: ProductDetail
            },

            {
                path: '/deliveries',
                name: 'DeliveryManager',
                component: DeliveryManager
            },
            {
                path: '/deliveries/:id',
                name: 'DeliveryDetail',
                component: DeliveryDetail
            },



    ]
})
