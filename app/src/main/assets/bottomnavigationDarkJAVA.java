
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;


public class BottomNavigationDark extends AppCompatActivity {
    Context mContext;

    // Attributes for Bottom Navigation View
    private BottomNavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_dark);
        mContext = BottomNavigationDark.this;

        // For Bottom Navigation View
        // Calling Method....
        initComponent();
    }

    // method for BottomNavigation
    // You define any other name instead of 'initComponent'
    private void initComponent() {

        navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_recent:
                        // implement your code..
                        return true;
                    case R.id.navigation_favorites:
                        // implement your code..
                        return true;
                    case R.id.navigation_nearby:
                        // implement your code..
                        return true;
                }
                return false;
            }
        });

    }
}
