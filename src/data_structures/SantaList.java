package data_structures;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class SantaList implements MouseListener{
	
	private JLabel loadImageFromTheInternet (String imageUrl) 
	{
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			return new JLabel(icon);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private JLabel loadImageFromJavaProject (String fileName)
	{
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}
	
	Random r = new Random();
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	ArrayList<JLabel> list = new ArrayList<JLabel>();
	
	SantaList()
	{
		
		
		frame.add(panel);
		panel.addMouseListener(this);
		String l = JOptionPane.showInputDialog("How many things do you want");
		int len = Integer.parseInt(l);
	
		for (int i = 0; i < len; i++) {
			String s = JOptionPane.showInputDialog("object");
			list.add(loadImageFromTheInternet(s));
		}
		frame.add(list.get(0));
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		SantaList s = new SantaList();
		
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}    
	
}
