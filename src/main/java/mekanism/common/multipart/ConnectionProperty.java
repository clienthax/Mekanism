package mekanism.common.multipart;

import mekanism.common.multipart.PartSidedPipe.ConnectionType;
import net.minecraftforge.common.property.IUnlistedProperty;
import scala.actors.threadpool.Arrays;

public class ConnectionProperty implements IUnlistedProperty<ConnectionProperty>
{
	public static ConnectionProperty INSTANCE = new ConnectionProperty();
	
	public byte connectionByte;
	public byte transmitterConnections;
	public ConnectionType[] connectionTypes;
	public boolean renderCenter;
	
	public ConnectionProperty() {}
	
	public ConnectionProperty(byte b, byte b1, ConnectionType[] types, boolean center)
	{
		connectionByte = b;
		transmitterConnections = b1;
		connectionTypes = types;
		renderCenter = center;
	}
	
	@Override
	public String getName() 
	{
		return "connection";
	}

	@Override
	public boolean isValid(ConnectionProperty value) 
	{
		return true;
	}

	@Override
	public Class getType() 
	{
		return getClass();
	}

	@Override
	public String valueToString(ConnectionProperty value) 
	{
		return Byte.toString(connectionByte) + "_" + Byte.toString(transmitterConnections) + "_" 
				+ Arrays.toString(connectionTypes) + "_" + renderCenter;
	}
}
