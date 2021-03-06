package agency.grolvl.mibandgrepper;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by tlk on 23/01/15.
 */
public class DeviceListAdapter extends ArrayAdapter<BluetoothDevice> {

    private Context context;

    private final static String TAG = "DeviceListAdapter";

    public DeviceListAdapter(Context context, int resource) {
        super(context, resource);
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        BluetoothDevice device = getItem(position);
        LayoutInflater inflater = LayoutInflater.from(context);
        View row = inflater.inflate(android.R.layout.simple_list_item_2, parent, false);
        TextView name = (TextView) row.findViewById(android.R.id.text1);
        TextView address = (TextView) row.findViewById(android.R.id.text2);
        name.setText(device.getName());
        address.setText(device.getAddress().toString());
        return row;
    }
}
