 <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.LAUNCHER" />
                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />

                <data
                    android:mimeType="video/*"
                    android:scheme="http" />
                <data
                    android:mimeType="video/*"
                    android:scheme="rtsp" />
                <data
                    android:mimeType="video/*"
                    android:scheme="rtmp" />
                <data
                    android:mimeType="video/*"
                    android:scheme="udp" />
                <data
                    android:mimeType="video/*"
                    android:scheme="tcp" />
                <data
                    android:mimeType="video/*"
                    android:scheme="file" />
                <data
                    android:mimeType="video/*"
                    android:scheme="content" />
                <data
                    android:mimeType="video/*"
                    android:scheme="mms" />
                <data android:mimeType="application/octet-stream" />
                <data android:mimeType="application/x-mpegurl" />
                <data android:mimeType="application/vnd.apple.mpegurl" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.DEFAULT" />

                <data android:scheme="content" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />

                <data
                    android:mimeType="application/x-mpegurl"
                    android:scheme="http" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />

                <data android:scheme="rtsp" />
                <data android:scheme="rtmp" />
                <data android:scheme="mms" />
                <data android:scheme="tcp" />
                <data android:scheme="udp" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />
                <action android:name="android.intent.action.SEND" />
                <action android:name="android.intent.action.SENDTO" />

                <category android:name="android.intent.category.DEFAULT" />

                <data android:mimeType="video/*" />
                <data android:mimeType="application/sdp" />
                <data android:mimeType="application/octet-stream" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />

                <data android:scheme="http" />
                <data android:mimeType="video/*" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />

                <data android:scheme="file" />
                <data android:scheme="content" />
                <data android:scheme="http" />
                <data android:scheme="https" />
                <data android:scheme="ftp" />
                <data android:scheme="rtsp" />
                <data android:scheme="rtmp" />
                <data android:scheme="mms" />
                <data android:scheme="tcp" />
                <data android:scheme="udp" />
                <data android:scheme="gopher" />
                <data android:mimeType="video/*" />
                <!-- <data android:mimeType="audio/*" /> -->
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />

                <data android:scheme="file" />
                <data android:scheme="content" />
                <data android:scheme="http" />
                <data android:scheme="https" />
                <data android:scheme="ftp" />
                <data android:scheme="rtsp" />
                <data android:scheme="rtmp" />
                <data android:scheme="mms" />
                <data android:scheme="tcp" />
                <data android:scheme="udp" />
                <data android:scheme="gopher" />
                <data android:host="*" />
                <data android:pathPattern=".*\\.avi" />
                <data android:pathPattern=".*\\.asf" />
                <data android:pathPattern=".*\\.f4v" />
                <data android:pathPattern=".*\\.flv" />
                <data android:pathPattern=".*\\.mkv" />
                <data android:pathPattern=".*\\.mpeg" />
                <data android:pathPattern=".*\\.mpg" />
                <data android:pathPattern=".*\\.mov" />
                <data android:pathPattern=".*\\.rm" />
                <data android:pathPattern=".*\\.vob" />
                <data android:pathPattern=".*\\.wmv" />
                <data android:pathPattern=".*\\.ts" />
                <data android:pathPattern=".*\\.tp" />
                <data android:pathPattern=".*\\.m3u" />
                <data android:pathPattern=".*\\.m3u8" />
                <data android:pathPattern=".*\\.m4v" />
                <data android:pathPattern=".*\\.mp4" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />

                <data android:scheme="rtsp" />
                <data android:mimeType="video/*" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />

                <data android:scheme="rtsp" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.DEFAULT" />
                <category android:name="android.intent.category.BROWSABLE" />

                <data android:scheme="http" />
                <data android:mimeType="video/*" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.DEFAULT" />

                <data android:mimeType="video/*" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.VIEW" />

                <category android:name="android.intent.category.DEFAULT" />

                <data android:scheme="file" />
                <data android:mimeType="video/*" />
            </intent-filter>
            <intent-filter>
                <action android:name="android.intent.action.SEARCH" />

                <category android:name="android.intent.category.DEFAULT" />
            </intent-filter>