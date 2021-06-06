import android.content.Context;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

public class BottomNavigationBasic extends AppCompatActivity {
    Context mContext;

    // Attributes for Bottom Navigation View
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_basic);
        mContext = BottomNavigationBasic.this;

        // For Toolbar
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("HOME");

        // For Bottom Navigation View
        // Calling Method....
        bottomNavigationViewHandler();
    }

    // Method For  BottomNavigationView
    public void bottomNavigationViewHandler() {
        bottomNavigationView = findViewById(R.id.t1_l1_bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
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
                    default:
                        return false;
                }
            }
        });
    }
}
