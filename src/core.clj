(ns core
  (:import (ch.bailu.gtk.gio ApplicationFlags)
           (ch.bailu.gtk.gtk Application ApplicationWindow)
           (ch.bailu.gtk.type Str Strs)))

(ApplicationWindow.
 (Application. (Str. "com.example.GtkApplication")
               (ApplicationFlags/FLAGS_NONE)))
