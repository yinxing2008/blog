import request from '../router/axios';
import {baseUrl} from "../config/env";
import qs from 'qs'

export const login = (form) => {
    window.qs = qs;
    return request({
        url: baseUrl + 'api/login',
        method: 'post',
        data: {
            name: form.username,
            password: form.password
        },
        headers: { "Content-Type": "application/json" },
    })
};

export const register = (form) => {
    window.qs = qs;
    return request({
        url: baseUrl + 'api/register',
        method: 'post',
        data: {
            name: form.username,
            password: form.password
        },
        headers: { "Content-Type": "application/json" },
    })
};


