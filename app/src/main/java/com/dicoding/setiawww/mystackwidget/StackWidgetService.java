package com.dicoding.setiawww.mystackwidget;

import android.content.Intent;
import android.widget.RemoteViewsService;

/**
 * Created by setiawww on 21/11/2017.
 */

public class StackWidgetService extends RemoteViewsService {
    @Override
    public RemoteViewsService.RemoteViewsFactory onGetViewFactory(Intent intent) {
        return new StackRemoteViewsFactory(this.getApplicationContext(), intent);
    }
}
