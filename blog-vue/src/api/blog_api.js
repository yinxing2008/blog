import request from '../router/axios';
import {baseUrl} from "../config/env";
import qs from 'qs'

export const addBlog = (form) => {
    window.qs = qs;
    return request({
        url: baseUrl + 'blog/api/add',
        method: 'post',
        data: qs.stringify(form),
        headers: {"Content-Type": "application/x-www-form-urlencoded"},
    })
};

export const modifyBlog = (form) => {
    window.qs = qs;
    return request({
        url: baseUrl + 'blog/api/modify',
        method: 'post',
        data: qs.stringify(form),
        headers: {"Content-Type": "application/x-www-form-urlencoded"},
    })
};

export const listBlog = (userId) => {
    return request({
        url: baseUrl + 'blog/api/list/'+userId,
        method: 'get',
    })
};

export const queryBlog = (blogId) => {
    return request({
        url: baseUrl + 'blog/api/query/'+blogId,
        method: 'get',
    })
};

export const delBlog = (blogId) => {
    return request({
        url: baseUrl + 'blog/api/del/'+blogId,
        method: 'get',
    })
};
