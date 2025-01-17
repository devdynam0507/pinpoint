import { Injectable } from '@angular/core';
import { Subject, Observable } from 'rxjs';
import { filter, takeUntil, pluck } from 'rxjs/operators';

interface IMessageParam {
    to: string;
    param?: any;
}

@Injectable()
export class MessageQueueService {
    private messageQueue = new Subject<IMessageParam>();

    constructor() {}
    sendMessage(message: IMessageParam): void {
        this.messageQueue.next(message);
    }

    receiveMessage(unsubscribe: Subject<any>, to: string): Observable<any> {
        return this.messageQueue.pipe(
            takeUntil(unsubscribe),
            filter((message: IMessageParam) => message.to === to),
            pluck('param'),
        );
    }
}

export enum MESSAGE_TO {
    TIMELINE_SELECTED_EVENT_STATUS = 'TIMELINE_SELECTED_EVENT_STATUS',
    TIMELINE_ZOOM_IN = 'TIMELINE_ZOOM_IN',
    TIMELINE_ZOOM_OUT = 'TIMELINE_ZOOM_OUT',
    TIMELINE_MOVE_PREV = 'TIMELINE_MOVE_PREV',
    TIMELINE_MOVE_NEXT = 'TIMELINE_MOVE_NEXT',
    TIMELINE_MOVE_NOW = 'TIMELINE_MOVE_NOW',

    THREAD_DUMP_SET_PARAM = 'THREAD_DUMP_SET_PARAM',

    USER_GROUP_SELECTED_USER_GROUP = 'USER_GROUP_SELECTED_USER_GROUP',
    GROUP_MEMBER_SET_CURRENT_GROUP_MEMBERS =  'GROUP_MEMBER_SET_CURRENT_GROUP_MEMBERS',
    PINPOINT_USER_ADD_USER = 'PINPOINT_USER_ADD_USER',
    PINPOINT_USER_REMOVE_USER = 'PINPOINT_USER_REMOVE_USER',
    PINPOINT_USER_UPDATE_USER = 'PINPOINT_USER_UPDATE_USER',

    REAL_TIME_SCATTER_CHART_X_RANGE = 'REAL_TIME_SCATTER_CHART_X_RANGE',

    INSPECTOR_PAGE_VALID = 'INSPECTOR_PAGE_VALID',
    INSPECTOR_CHART_MANAGER_ADD = 'INSPECTOR_CHART_MANAGER_ADD',
    INSPECTOR_CHART_MANAGER_REMOVE = 'INSPECTOR_CHART_MANAGER_REMOVE',
    INSPECTOR_CHART_MANAGER_CHANGE_ORDER = 'INSPECTOR_CHART_MANAGER_CHANGE_ORDER',
    INSPECTOR_CHART_MOUSE_MOVE = 'INSPECTOR_CHART_MOUSE_MOVE',

    APPLICATION_REMOVED = 'APPLICATION_REMOVED',
    CALL_TREE_ROW_SELECT = 'CALL_TREE_ROW_SELECT',

    TRANSACTION_TIMELINE_SELECT_TRANSACTION = 'TRANSACTION_TIMELINE_SELECT_TRANSACTION',

    SERVER_MAP_DISABLE = 'SERVER_MAP_DISABLE',
    SERVER_MAP_DATA_UPDATE = 'SERVER_MAP_DATA_UPDATE',
    SERVER_MAP_TARGET_SELECT = 'SERVER_MAP_TARGET_SELECT',
    SERVER_MAP_TARGET_SELECT_BY_LIST = 'SERVER_MAP_TARGET_SELECT_BY_LIST',
    SERVER_MAP_MERGE_STATE_CHANGE = 'SERVER_MAP_MERGE_STATE_CHANGE',

    AGENT_SELECT_FOR_SERVER_LIST = 'AGENT_SELECT_FOR_SERVER_LIST',

    IS_ACCESS_DENYED = 'IS_ACCESS_DENYED',
    SET_CHART_LAYOUT = 'SET_CHART_LAYOUT',
}
