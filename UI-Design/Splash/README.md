# Caution:

1. The Rokomari logo needs to be imported into the /drawable directory or can be taken from https://www.rokomari.com/static/200/images/rokomari_logo.png (with the authority's permission) .

2. The <intent-filter> needs to be inside .Splash activity inside Manifest file as below:

        <activity
            android:name=".Splash"
            android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN" />
                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        
