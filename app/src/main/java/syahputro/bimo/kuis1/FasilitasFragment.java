package syahputro.bimo.kuis1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FasilitasFragment extends Fragment {

    public FasilitasFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static FasilitasFragment newInstance() {
        FasilitasFragment fragment = new FasilitasFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fasilitas, container, false);
    }
}
